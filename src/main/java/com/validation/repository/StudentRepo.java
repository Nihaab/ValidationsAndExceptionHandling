package com.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validation.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{
	
}
