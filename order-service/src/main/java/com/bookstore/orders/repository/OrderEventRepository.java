package com.bookstore.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.orders.domain.OrderEventEntity;

public interface OrderEventRepository extends JpaRepository<OrderEventEntity, Long> {}
