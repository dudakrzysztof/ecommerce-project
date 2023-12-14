package io.github.dudakrzysztof.ecommerce.dao;

import io.github.dudakrzysztof.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);
}
