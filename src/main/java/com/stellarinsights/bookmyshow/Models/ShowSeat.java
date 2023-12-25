package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Event event;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus status;




}
