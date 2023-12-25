package com.stellarinsights.bookmyshow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class User extends  BaseModel{
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private int age;
}
