package com.bookstore.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableDiscoveryClient
public class BookstoreWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreWebappApplication.class, args);
    }
}
