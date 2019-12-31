package com.djallil.ems.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
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

    public int getId() {
        return id;
    }

    public void setId(int employeeNumber) {
        this.id = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public Office getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Office officeCode) {
        this.officeCode = officeCode;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
    }
}
