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
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Integer productCountNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    private User orderUser;


    @ManyToOne(cascade = CascadeType.ALL)
    private Product orderProduct;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address orderAddress;

}
