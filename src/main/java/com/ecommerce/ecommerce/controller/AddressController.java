package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.Address;
import com.ecommerce.ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("getAll")
    public List<Address> getAllAddress(){
        return  addressService.getAllAdress();

    }
    @GetMapping("getbyid/{Id}")
    public Address getAddressById(@PathVariable Long Id){
        return addressService.getAddressById(Id);

    }
    @PostMapping("addaddress")
    public  String addUser(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @DeleteMapping("delete/{Id}")
    public String deleteById(@PathVariable Long Id){
        return addressService.deleteById(Id);
    }


}
