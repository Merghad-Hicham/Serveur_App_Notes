package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	@Query(value="select * from todo l where l.id like 'x'",nativeQuery=true)
	public Todo getTodo(@Param("x")Long id);
	

}
