package com.example.springcrud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping("/{name}")
    public ResponseEntity name(@PathVariable String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return ResponseEntity.ok(map);
    }

}
