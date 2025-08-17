package com.bookstore.catalog.model;

import java.math.BigDecimal;
//DTO class to exchange data btwn services or to expose data to clients
public record Product(String code, String name, String description, String imageUrl, BigDecimal price) {}
