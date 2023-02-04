package com.example.demo.controller;

import com.example.demo.client.ApiFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "feign")
public class TestController {

    @Autowired
    private ApiFeignClient apiFeignClient;

    @GetMapping(path = "/posts")
    public ResponseEntity<String> getAllPost() {
        return ResponseEntity.ok(apiFeignClient.getAllPost());
    }

    @GetMapping(path = "/post/{id}")
    public ResponseEntity<String> getPost(@PathVariable String id) {
        return ResponseEntity.ok(apiFeignClient.getPost(id));
    }
}
