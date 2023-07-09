package com.ecommerce.ecommerce.Repo;

import com.ecommerce.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
