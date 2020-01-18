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
    @Column(name = "employeeId", insertable = false)
    private int id;

    @Column(name = "employeeName")
    private String name;

    @Column(name = "employeeAddress")
    private String address;

    @Column(name = "employeeEmail")
    private String email;

}
