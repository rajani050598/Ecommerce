package com.ecommerce.ecommerce.service;
import com.ecommerce.ecommerce.Repo.AddressRepo;
import com.ecommerce.ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    public List<Address> getAllAdress(){
        return  addressRepo.findAll();
    }
    public Address getAddressById(Long Id){
        Optional<Address> addressOptional = addressRepo.findById(Id);
        Address address=null;
        if(addressOptional.isPresent()) address=addressOptional.get();
        return  address;
    }
    public String addAddress(Address address){
        addressRepo.save(address);
        return "added";
    }
    public String deleteById(Long Id){
        addressRepo.deleteById(Id);
        return "deleted";
    }
}
