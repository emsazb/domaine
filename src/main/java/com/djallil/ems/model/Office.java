package com.djallil.ems.model;

import javax.persistence.*;

@Entity
@Table(name = "offices")
public class Office {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address_Line1")
    private String addressLine1;
    @Column(name = "address_Line2")
    private String addressLine2;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "postal_Code")
    private String postalCode;
    @Column(name = "territory")
    private String territory;


    public int getId() {
        return id;
    }

    public void setId(int officeCode) {
        this.id = officeCode;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

}
