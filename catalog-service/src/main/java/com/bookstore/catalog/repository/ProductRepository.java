package com.bookstore.catalog.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.catalog.model.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByCode(String code);
}
