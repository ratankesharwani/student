package com.example.student.address.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String houseNumber;
    @Column
    private String area;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @Column
    private String pincode;
}
