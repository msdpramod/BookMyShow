package com.stellarinsights.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Payment extends BaseModel{
    private  int amount;
    private User user;
    private PaymentProvider paymentProvider;
    private PaymentStatus paymentStatus;
    private Date paymentTime;
    private PaymentType paymentType;


}
