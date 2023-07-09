package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.Address;
import com.ecommerce.ecommerce.model.Order;
import com.ecommerce.ecommerce.service.AddressService;
import com.ecommerce.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("getAll")
    public List<Order> getAllorder(){
        return  orderService.getAllorders();

    }
    @GetMapping("getbyid/{Id}")
    public Order getorderById(@PathVariable Long Id){
        return orderService.getorderById(Id);

    }
    @PostMapping("addorder")
    public  String addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }
    @DeleteMapping("delete/{Id}")
    public String deleteById(@PathVariable Long Id){
        return orderService.deleteById(Id);
    }

}
