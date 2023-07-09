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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private Integer productCountNumber;

   // @ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne
    private User orderUser;


    //@ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne
    private Product orderProduct;

    //@ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne
    private Address orderAddress;

}
