package io.github.dudakrzysztof.ecommerce.service;

import io.github.dudakrzysztof.ecommerce.dto.Purchase;
import io.github.dudakrzysztof.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
