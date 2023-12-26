package com.stellarinsights.bookmyshow.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class ResponseTicketDTO {
    private int amount;
    private String movieName;
    private Long ticketId;
    private List<String> seatNumber;
    private String auditoriumName;
    private String status;
    private String message;

}
