package com.example.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.test.model.User;

public interface StudentRepository extends CrudRepository<User, String> {

}
