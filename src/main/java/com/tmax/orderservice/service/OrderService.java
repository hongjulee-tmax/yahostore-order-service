package com.tmax.orderservice.service;

import com.tmax.orderservice.config.MyShopServerProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tmax.orderservice.dto.PostStoreOrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class OrderService {
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final String baseUrl;

    public OrderService(RestTemplateBuilder restTemplateBuilder,
                         MyShopServerProperties properties,
                         ObjectMapper mapper) {
        log.info("Myshop connectionTimeout: {}", properties.getConnectionTimeoutMs().toMillis());
        log.info("Myshop readTimeout: {}", properties.getReadTimeoutMs().toMillis());

        this.restTemplate = restTemplateBuilder
                .setConnectTimeout(properties.getConnectionTimeoutMs())
                .setReadTimeout(properties.getReadTimeoutMs())
                .defaultHeader("Content-Type", MediaType.APPLICATION_JSON.toString())
                .build();

        this.baseUrl = properties.getUri();
        this.objectMapper = mapper;
    }

    @Transactional
    public PostStoreOrderDto.Response createStoreOrder(PostStoreOrderDto.Request request){
        return null;
    }
    @Transactional
    public Object createStoreOrderUnit(){
        return null;
    }
    @Transactional
    public Object createShopOrder(){
        return null;
    }
    @Transactional
    public Object send(){ //이거 아님
        return null;
    }


    public Object selectStoreOrder(){
        return null;
    }
    public Object 주문내역조회(){
        return null;
    }
    public Object 주문상태조회(){
        return null;
    }
}
