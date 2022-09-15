package com.example.SpringLiquebase.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "company")
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "employee")
    private Employee employee;
}
