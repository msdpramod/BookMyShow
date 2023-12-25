package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter @Entity
public class Screen extends BaseModel{
    private String nameOfScreen;
    @OneToMany
    private List<Seat> seats;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;

}
