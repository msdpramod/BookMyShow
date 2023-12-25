package com.stellarinsights.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter
public class Ticket extends  BaseModel {
    private int amount;
    private List<Seat> seats;
    private Show show;
    private User user;
    private Payment payment;
    private TicketStatus ticketStatus;
    private Date bookingTime;
}
