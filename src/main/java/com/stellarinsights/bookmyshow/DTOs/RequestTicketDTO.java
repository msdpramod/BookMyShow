package com.stellarinsights.bookmyshow.DTOs;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class RequestTicketDTO {
    private List<Long> seatIds;
    private Long userId;
    private Long showId;
}
