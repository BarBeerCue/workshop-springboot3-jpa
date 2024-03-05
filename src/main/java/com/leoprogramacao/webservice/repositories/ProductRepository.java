package com.leoprogramacao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoprogramacao.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
