package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Event event;
    @ManyToOne
    private SeatType seatType;
    private int price;
}
