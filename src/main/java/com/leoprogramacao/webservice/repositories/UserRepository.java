package com.leoprogramacao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoprogramacao.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
