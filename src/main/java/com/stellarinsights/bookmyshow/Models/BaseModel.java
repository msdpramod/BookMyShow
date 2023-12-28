package com.stellarinsights.bookmyshow.Models;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
// MappedSuperclass is used when you want to inherit properties
// from a class but you don't want to map that class to the database.
@Getter
@Setter
public class BaseModel {
    @Id @GeneratedValue( strategy = GenerationType.AUTO)
    // @GeneratedValue annotation is used to specify the primary key generation strategy to use
    // for the primary key. The strategies can be either to identity, sequence or table.
    // GenerationType.AUTO is the default generation type and lets the persistence provider
    private Long id;

}
