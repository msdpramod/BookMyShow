package com.stellarinsights.bookmyshow.Services;

import com.stellarinsights.bookmyshow.Exceptions.InValidArgumetsException;
import com.stellarinsights.bookmyshow.Exceptions.SeatNotAvailableException;
import com.stellarinsights.bookmyshow.Models.*;
import com.stellarinsights.bookmyshow.Repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class TicketService {
    private final ShowSeatRepository showSeatRepository;
    private final SeatRepository seatRepository;
    private final ShowRepository showRepository;
    private final UserRepository userRepository;
    private final TicketRepository ticketRepository;
    @Autowired

    public TicketService(ShowSeatRepository showSeatRepository, SeatRepository seatRepository, ShowRepository showRepository, UserRepository userRepository, TicketRepository ticketRepository) {
        this.showSeatRepository = showSeatRepository;
        this.seatRepository = seatRepository;
        this.showRepository = showRepository;
        this.userRepository = userRepository;
        this.ticketRepository = ticketRepository;
    }


    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket BookTicket(List<Long> seatIds, Long userId, Long showId) throws InValidArgumetsException, SeatNotAvailableException {
        // 1. for these seatIds get the correponding showseats getSeatsForIds(ids)
        // 2. Check the status of all the showseats getShowSeatsForSeats(seats)
        // 2.a: every seat is available
        // 3.a: lock every seat (set the status to be locked)
        // 4.a: Create ticket obj and return it
        // 2.b some of the seats are not available
        // 3.b: throw an exception
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isEmpty()) {
            throw new InValidArgumetsException ("User with id: " + userId + " doesn't exist.");
        }

        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty()){
            throw new InValidArgumetsException(showId+"Show not found");
        }


        List<Seat> seats = seatRepository.findAllByIdIn(seatIds);


        List<ShowSeat> showSeats = showSeatRepository.findAllBySeatInAndShow(seats, showOptional.get());
        for (ShowSeat showSeat: showSeats) {
            if (!(showSeat.getStatus().equals(ShowSeatStatus.AVAILABLE) || (
                    showSeat.getStatus().equals(ShowSeatStatus.LOCKED)))) { // && new Date( - showSeat.getLockedAt())))) {
                throw new SeatNotAvailableException();
            }
        }


        List<ShowSeat> lockedShowSeats = new ArrayList<>();
        for (ShowSeat showSeat: showSeats) {
            showSeat.setStatus(ShowSeatStatus.LOCKED);
            showSeat.setLockedAt(new Date());
            lockedShowSeats.add(showSeatRepository.save(showSeat));
        }



        Ticket ticket = new Ticket();
        ticket.setUser(userOptional.get());
        ticket.setTicketStatus(TicketStatus.PROCESSING);
        ticket.setShow(showOptional.get());
        ticket.setSeats(seats);
        ticket.setAmount(0);
        ticket.setBookingTime(new Date());



        Ticket savedTicket = ticketRepository.save(ticket);

        return savedTicket;


    }
}