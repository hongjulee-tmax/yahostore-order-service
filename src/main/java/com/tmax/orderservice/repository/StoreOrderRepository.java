package com.tmax.orderservice.repository;

import com.tmax.orderservice.entity.StoreOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreOrderRepository extends JpaRepository<StoreOrder, Long> {
}