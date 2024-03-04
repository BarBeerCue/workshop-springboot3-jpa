package com.leoprogramacao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoprogramacao.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
