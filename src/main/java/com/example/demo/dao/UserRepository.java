package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value="select * from users u where u.id like :x",nativeQuery=true)
	public User getUser(@Param("x") Long id);

}
