package com.stellarinsights.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Movie extends BaseModel{
    private String nameOfMovie;
    private List<Language> languages;

}
