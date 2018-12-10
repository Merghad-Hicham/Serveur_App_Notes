package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Note;



public interface NoteRepository extends JpaRepository<Note, Long>{
	
	
	 @Query(value="select * from note n where n.id like 'x'",nativeQuery=true)
	public Note getNote(@Param("x") Long id);
	 
	 @Query(value="select * from note n where n.user_id like 'x'",nativeQuery=true)
	public List<Note> getAll(@Param("x") Long id);

}
