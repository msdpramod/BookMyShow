package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter @Entity
public class Movie extends BaseModel{
    private String nameOfMovie;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Language> languages;

}
