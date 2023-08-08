package com.tmax.orderservice.entity;

import jakarta.persistence.*;

@Entity
public class StoreOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "store_order_seq_gen")
    Long id;
    Long storeOrderNo;
    Boolean status;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Persona persona;
}
