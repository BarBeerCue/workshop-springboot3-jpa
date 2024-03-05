package com.leoprogramacao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoprogramacao.webservice.entities.OrderItem;
import com.leoprogramacao.webservice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
