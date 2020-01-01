package com.djallil.ems.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "offices")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
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

}
