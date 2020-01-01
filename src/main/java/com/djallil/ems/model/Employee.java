package com.djallil.ems.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Employee {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "extension")
    private String extension;
    @Column(name = "email")
    private String email;
    @Column(name = "job_Title")
    private String jobTitle;
    @ManyToOne
    @JoinColumn(name = "office_Code", referencedColumnName = "id")
    private Office officeCode;
    @ManyToOne
    @JoinColumn(name = "reports_To", referencedColumnName = "id")
    private Employee reportsTo;
}
