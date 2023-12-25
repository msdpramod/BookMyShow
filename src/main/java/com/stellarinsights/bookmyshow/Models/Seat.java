package com.stellarinsights.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Seat extends BaseModel{
    private String seatNumber;
    private int row;
    private int column;
    private SeatType seatType;
}
