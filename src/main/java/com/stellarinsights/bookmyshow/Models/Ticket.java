package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter @Entity
public class Ticket extends  BaseModel {
    private int amount;
    @ManyToMany
    private List<Seat> seats;
    @ManyToOne
    private Event event;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "ticket")
    private List<Payment> payment;
    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;
    private Date bookingTime;
}
