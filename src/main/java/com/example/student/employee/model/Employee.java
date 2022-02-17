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

    @Column(nullable = false,length = 20)
    private String firstName;

    @Column(nullable = true, length = 20)
    private String middleName;

    @Column(nullable = false, length = 20)
    private String lastName;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REFRESH)
    @JoinColumn(nullable = false)
    private Address address;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false,length = 20)
    private String phoneNumber;

    @Column
    private GenderType gender;
}
