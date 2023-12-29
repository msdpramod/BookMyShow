package com.stellarinsights.bookmyshow.Controllers;

import com.stellarinsights.bookmyshow.DTOs.ResponseTicketDTO;
import com.stellarinsights.bookmyshow.DTOs.RequestTicketDTO;
import com.stellarinsights.bookmyshow.Models.Seat;
import com.stellarinsights.bookmyshow.Models.Ticket;
import com.stellarinsights.bookmyshow.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class TicketController {
    private TicketService ticketService;
    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public ResponseTicketDTO bookTicket(RequestTicketDTO requestTicketDTO){

//        try {
////            ticketService.bookTicket()
//        } catch (TimeoutException e) {
//            response.setStatus("FAILURE");
//            response.setMessage("Something is wrong");
//        }

        return null;
    }
}
