package com.amit.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amit.demo.Entity.UserEntity;
@Repository("userRepo")
public interface UserRepository extends JpaRepository<UserEntity , Long> 
{
	@Query(value="SELECT ud from userdetails ud where ud.status=?1",nativeQuery=true)
	public List<UserEntity> getUserByStatus(String status);
}
