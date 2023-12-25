package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Seat extends BaseModel{
    private String seatNumber;
    @Column(name = "rowz")
    private int row;
    @Column(name = "colz")
    private int column;
    @ManyToOne
    private SeatType seatType;
}
