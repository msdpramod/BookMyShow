package com.stellarinsights.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Show extends BaseModel{
    private Screen screens;
    private Date startTime;
    private Date endTime;
    private Movie movie;
    private Language languages;

}
