package com.bamboo.api.v1.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeid", insertable = false)
    private int id;

    @Column(name = "employeename")
    private String name;

    @Column(name = "employeeaddress")
    private String address;

    @Column(name = "employeeemail")
    private String email;

}
