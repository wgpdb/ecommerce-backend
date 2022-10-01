package com.wgpdb.ecommerce.controller;

import com.wgpdb.ecommerce.dto.Purchase;
import com.wgpdb.ecommerce.dto.PurchaseResponse;
import com.wgpdb.ecommerce.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/checkout")
@CrossOrigin("http://localhost:4200")
public class CheckoutController {

    private final CheckoutService checkoutService;

    @PostMapping("/purchase")
    public ResponseEntity<PurchaseResponse> placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return ResponseEntity.ok(purchaseResponse);
    }
}