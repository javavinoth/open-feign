package com.example.demo.client.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class FeignRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Content-Type", MediaType.APPLICATION_JSON_VALUE);
    }
}
