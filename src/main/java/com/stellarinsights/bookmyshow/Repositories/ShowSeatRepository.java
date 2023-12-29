package com.stellarinsights.bookmyshow.Repositories;

import com.stellarinsights.bookmyshow.Models.Seat;
import com.stellarinsights.bookmyshow.Models.Show;
import com.stellarinsights.bookmyshow.Models.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long>{

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    // LockModeType.PESSIMISTIC_WRITE is used to lock the row in the database
    List<ShowSeat> findAllBySeatInAndShow(List<Seat> seat, Show show);

    @Override
    ShowSeat save(ShowSeat showSeat);
}
