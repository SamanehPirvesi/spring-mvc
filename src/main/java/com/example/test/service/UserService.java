package com.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.test.model.User;
import com.example.test.repository.StudentRepository;

@Service
public class UserService {
@Autowired
private StudentRepository studentRepo;

public void registerUser(User u) {
	 studentRepo.save(u);
	
}
}
