package com.stellarinsights.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Screen extends BaseModel{
    private String nameOfScreen;
    private List<Seat> seats;
    private List<Feature> features;

}
