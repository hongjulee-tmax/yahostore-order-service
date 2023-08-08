package com.tmax.orderservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@SequenceGenerator(name = "store_order_unit_seq_gen",
                    sequenceName = "store_order_unit_seq",
                    initialValue = 100000000,
                    allocationSize = 1)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class StoreOrderUnit {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "store_order_unit_seq_gen")
    Long id;
    int count;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "store_order_id")
    StoreOrder storeOrder;
    @OneToMany(mappedBy = "storeOrderUnit", cascade = CascadeType.ALL, orphanRemoval = true)
    List<StoreProduct> storeProducts = new ArrayList<>();
}
