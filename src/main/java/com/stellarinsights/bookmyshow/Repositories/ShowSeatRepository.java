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
    //    @Query("select * from shows where startTime FOR UPDATE")
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<ShowSeat> findAllBySeatInAndShow(List<Seat> seat, Show show);

    @Override
    ShowSeat save(ShowSeat showSeat);
}
