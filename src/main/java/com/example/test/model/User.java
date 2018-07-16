package com.example.test.model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	
	@NotBlank(message="username should not be empty")
	private String username;	
	@Size(min=8,max=32)
	private String password;
	private List<String> coursesName;
	private Address address;
	public User() {
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getCoursesName() {
		return coursesName;
	}
	public void setCoursesName(List<String> coursesName) {
		this.coursesName = coursesName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}