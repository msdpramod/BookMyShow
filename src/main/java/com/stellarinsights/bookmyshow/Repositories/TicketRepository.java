package com.stellarinsights.bookmyshow.Repositories;

import com.stellarinsights.bookmyshow.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    //Ticket save(Ticket ticket);

    @Override
    <S extends Ticket> S save(S entity);
}
