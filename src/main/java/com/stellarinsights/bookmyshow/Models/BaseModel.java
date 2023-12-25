package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class BaseModel {
    @Id @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

}
