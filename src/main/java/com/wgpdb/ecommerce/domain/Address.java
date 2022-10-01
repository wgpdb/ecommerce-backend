package com.wgpdb.ecommerce.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "post_code")
    private String postCode;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Order order;
}