package io.github.dudakrzysztof.ecommerce.controller;

import io.github.dudakrzysztof.ecommerce.dto.Purchase;
import io.github.dudakrzysztof.ecommerce.dto.PurchaseResponse;
import io.github.dudakrzysztof.ecommerce.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        return checkoutService.placeOrder(purchase);
    }

}
