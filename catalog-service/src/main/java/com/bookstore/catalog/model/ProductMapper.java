package com.bookstore.catalog.model;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductEntity productEntity) {
        return new Product(
                productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getPrice());
    }
}
