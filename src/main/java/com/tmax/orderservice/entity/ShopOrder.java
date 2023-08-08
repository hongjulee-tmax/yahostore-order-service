package com.tmax.orderservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@SequenceGenerator(
        name="SHOP_ORDER_SEQ_GEN",
        sequenceName="SHOP_ORDER_SEQ",
        initialValue=100000000,
        allocationSize=1
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShopOrder {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHOP_ORDER_SEQ_GEN")
    Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="shop_product_id")
    ShopProduct shopProduct;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="store_order_unit_id")
    StoreOrderUnit storeOrderUnit;
    String shopOrderNo;
}
