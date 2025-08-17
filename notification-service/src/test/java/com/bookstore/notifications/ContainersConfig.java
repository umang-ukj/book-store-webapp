package com.bookstore.notifications;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.DynamicPropertyRegistrar;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class ContainersConfig {
    @Bean
    @ServiceConnection
    MySQLContainer<?> mySqlContainer() {
        return new MySQLContainer<>(DockerImageName.parse("\"mysql:8.0.33"));
    }

    @Bean
    @ServiceConnection
    RabbitMQContainer rabbitContainer() {
        return new RabbitMQContainer(DockerImageName.parse("rabbitmq:4.0.4-alpine"));
    }

    @Bean
    GenericContainer<?> mailhog() {
        return new GenericContainer<>(DockerImageName.parse("mailhog/mailhog:v1.0.1")).withExposedPorts(1025);
    }

    @Bean
    DynamicPropertyRegistrar dynamicPropertyRegistrar(GenericContainer<?> mailhog) {
        return (registry) -> {
            registry.add("spring.mail.host", mailhog::getHost);
            registry.add("spring.mail.port", mailhog::getFirstMappedPort);
        };
    }
}
