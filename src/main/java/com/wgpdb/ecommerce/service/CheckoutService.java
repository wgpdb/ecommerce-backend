package com.wgpdb.ecommerce.service;

import com.wgpdb.ecommerce.dto.Purchase;
import com.wgpdb.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}