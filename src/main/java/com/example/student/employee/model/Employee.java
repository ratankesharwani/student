package com.example.student.employee.model;

import com.example.student.address.model.Address;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    @JoinColumn
    private Address address;

    @Column
    private String email;

    @Column
    private String phoneNumber;

    @Column
    private GenderType gender;
}
