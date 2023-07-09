package com.ecommerce.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String addressName;
    private String addressLandmark;
    private String addressPhoneNumber;
    private String zipCode;
    private String addressState;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

}
