package com.stellarinsights.bookmyshow.Repositories;

import com.stellarinsights.bookmyshow.Models.Seat;
import com.stellarinsights.bookmyshow.Models.Show;
import com.stellarinsights.bookmyshow.Models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long>{

    List<ShowSeat> findAllBySeatInAndShow(List<Seat> seat, Show show);

    @Override
    <S extends ShowSeat> S save(S entity);
}
