package com.ecommerce.ecommerce.Repo;

import com.ecommerce.ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address ,Long> {
}
