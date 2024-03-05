package com.leoprogramacao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoprogramacao.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
