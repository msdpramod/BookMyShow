package com.stellarinsights.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Theatre extends  BaseModel{
    private String nameOfTheatre;
    private String address;
    private List<Screen> screens;
    private City city;
}
