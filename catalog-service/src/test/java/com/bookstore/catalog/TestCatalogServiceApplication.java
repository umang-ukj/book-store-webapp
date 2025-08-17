package com.bookstore.catalog;

import org.springframework.boot.SpringApplication;

import com.bookstore.catalog.CatalogServiceApplication;

public class TestCatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(CatalogServiceApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
