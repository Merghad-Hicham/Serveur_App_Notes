package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Lable;



public interface LableRepository extends JpaRepository<Lable, Long>{
	
	@Query(value="select * from lable l where l.todo_id like 'x'",nativeQuery=true)
	public List<Lable> getlableTodo(@Param("x")Long id);
	
	@Query(value="select * from lable l where l.notes_id like 'x'",nativeQuery=true)
	public List<Lable> getlableNotes(@Param("x")Long id);

}
