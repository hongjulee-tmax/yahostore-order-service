package com.tmax.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class StoreProduct {
    @Id
    Long id;
    boolean isCombined;
    String name;
    String description;
    @ManyToOne
    StoreOrderUnit storeOrderUnit;
}
