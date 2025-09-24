package com.github.nenidan.ne_ne_challenge.domain.shop.order.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.nenidan.ne_ne_challenge.domain.shop.order.infrastructure.entity.OrderEntity;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, Long> {

    Optional<OrderEntity> findByUserIdAndId(Long userId, Long id);
}
