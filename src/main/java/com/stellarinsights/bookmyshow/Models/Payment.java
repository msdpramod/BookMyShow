package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @Entity
public class Payment extends BaseModel{
    private  int amount;
    private String refId;
    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private Date paymentTime;
    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;
    @ManyToOne
    private Ticket ticket;


}
