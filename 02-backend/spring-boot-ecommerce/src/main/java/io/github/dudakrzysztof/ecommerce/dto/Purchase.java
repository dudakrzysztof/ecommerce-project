package io.github.dudakrzysztof.ecommerce.dto;

import io.github.dudakrzysztof.ecommerce.entity.Address;
import io.github.dudakrzysztof.ecommerce.entity.Customer;
import io.github.dudakrzysztof.ecommerce.entity.Order;
import io.github.dudakrzysztof.ecommerce.entity.OrderItem;
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
