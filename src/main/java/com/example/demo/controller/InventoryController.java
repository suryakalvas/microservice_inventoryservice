package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @GetMapping("/status")
    public ResponseEntity<String> getInventoryStatus() {
        return ResponseEntity.ok("Inventory is available and healthy");
    }

    @GetMapping("/{productId}")
    public ResponseEntity<String> getProductStock(@PathVariable("productId") String productId) {
        return ResponseEntity.ok("Stock available for Product ID: " + productId);
    }
}
