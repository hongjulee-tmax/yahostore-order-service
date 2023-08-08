package com.tmax.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;

@Entity
public class ShopProduct {
    @Id
    @MapsId("store_product_id")
    Long store_product_id;
    String shopProductCode;
    int stock;
    int price;
}
