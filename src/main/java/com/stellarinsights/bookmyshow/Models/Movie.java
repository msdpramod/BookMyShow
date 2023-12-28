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
    // EnumType.ORDINAL is used to store the enum value in the database
    @ElementCollection
    // ElementCollection is used to store the collection of basic types
    private List<Language> languages;

}
