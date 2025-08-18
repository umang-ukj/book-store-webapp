package com.bookstore.orders.clients.catalog;

import java.math.BigDecimal;
//this class is used to map data coming from catalog service
public record Product(String code, String name, String description, String imageUrl, BigDecimal price) {}
