package com.stellarinsights.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class City extends BaseModel{
    private List<Theatre> theatres;
    private String nameOfCity;
}