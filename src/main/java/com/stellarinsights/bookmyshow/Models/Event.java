package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @Entity
public class Event extends BaseModel{
    @ManyToOne
    private Screen screens;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Movie movie;
    @Enumerated(EnumType.ORDINAL)
    private Language languages;

}
