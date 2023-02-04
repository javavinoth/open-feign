package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${api.client}", url = "${api.url}")
public interface ApiFeignClient {

    @GetMapping(value = "${api.get-all-post}")
    String getAllPost();

    @GetMapping(value = "${api.get-post}")
    String getPost(@PathVariable String id);
}
