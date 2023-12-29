package com.stellarinsights.bookmyshow.Models;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
// MappedSuperclass is used when you want to inherit properties
// from a class but you don't want to map that class to the database.
@Getter
@Setter
@EntityListeners({AuditingEntityListener.class})
// AuditingEntityListener is used to automatically populate the createdAt and updatedAt fields
public class BaseModel {
    @Id @GeneratedValue( strategy = GenerationType.AUTO)
    // @GeneratedValue annotation is used to specify the primary key generation strategy to use
    // for the primary key. The strategies can be either to identity, sequence or table.
    // GenerationType.AUTO is the default generation type and lets the persistence provider
    private Long id;
    @CreatedDate
    @Temporal(TemporalType.TIME)
    private Date createdDate;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedAt;

}
