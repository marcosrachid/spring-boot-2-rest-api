package com.rest.template.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.template.entities.User;

public interface UserRepository extends JpaRepository<User, String>{
}
