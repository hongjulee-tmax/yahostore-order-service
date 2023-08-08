package com.tmax.orderservice.controller;

import com.tmax.orderservice.dto.PostStoreOrderDto;
import com.tmax.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<PostStoreOrderDto.Response> createStoreOrder(@RequestBody PostStoreOrderDto.Request request){
        return ResponseEntity.ok().body(
                orderService.createStoreOrder(request)
        );
    }
}
