package com.wgpdb.ecommerce.dto;

import com.wgpdb.ecommerce.domain.Address;
import com.wgpdb.ecommerce.domain.Customer;
import com.wgpdb.ecommerce.domain.Order;
import com.wgpdb.ecommerce.domain.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}