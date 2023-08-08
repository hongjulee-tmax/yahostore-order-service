package com.tmax.orderservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Getter
@Setter
@Configuration
@ConfigurationProperties("tmax.myshop")
public class MyShopServerProperties {

    private String uri;
    private Duration connectionTimeoutMs;
    private Duration readTimeoutMs;
}

