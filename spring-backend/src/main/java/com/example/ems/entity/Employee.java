package com.example.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// lombok annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// jpa annotations
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    @Column(name = "email_id", nullable = false, unique = true)
    public String email;

}
