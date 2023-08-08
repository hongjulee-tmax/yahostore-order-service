package com.tmax.orderservice.repository;

import com.tmax.orderservice.entity.ShopProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopProductRepository extends JpaRepository<ShopProduct, Long> {
}
