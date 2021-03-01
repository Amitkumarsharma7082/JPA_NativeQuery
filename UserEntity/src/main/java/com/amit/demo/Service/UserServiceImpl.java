package com.amit.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.demo.Entity.UserEntity;
import com.amit.demo.Repository.UserRepository;

@Service ("userService")
@Transactional
public class UserServiceImpl 
{
@Autowired
private UserRepository userRepository ;

public List<UserEntity> userGetServByStatus(String status)
{
	return userRepository.getUserByStatus(status);
}



public Optional <UserEntity> userGetServ(Long id)
	{
		return userRepository.findById(id);
	}
public List<UserEntity> userGetServ()
	{
		return userRepository.findAll();
	}

public UserEntity userAddServ(UserEntity user)
	{
	return userRepository.save(user);
	}

public String userRemoveServ(Long id)
	{
		userRepository.deleteById(id);
		return "Deleted"+ "User Id : "+id;
	}

}











