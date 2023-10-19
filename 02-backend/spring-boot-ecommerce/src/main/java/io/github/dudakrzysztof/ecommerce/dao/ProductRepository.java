package io.github.dudakrzysztof.ecommerce.dao;

import io.github.dudakrzysztof.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
