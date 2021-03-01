package com.amit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.demo.Entity.UserEntity;
import com.amit.demo.Repository.UserRepository;
import com.amit.demo.Service.UserServiceImpl;

@RestController
 //@RequestMapping("api/v1")
public class AppController 
{
	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/user/status/{status}")
	public ResponseEntity<List<UserEntity>>getUserByStatus(@PathVariable String status)
	{
		return new ResponseEntity<>(userService.userGetServByStatus(status),HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<UserEntity>>getUserAll()
	{
		return new ResponseEntity<>(userService.userGetServ(),HttpStatus.OK);
	}
	
	@PostMapping("/user")
	public UserEntity saveUser(UserEntity user)
	{
		repo.save(user);
		return user;
	}
	
	
	
}
