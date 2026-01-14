package com.validation.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.validation.entity.Student;
import com.validation.repository.StudentRepo;



@RestController
@Cacheable
public class HomeController 
{
	@Autowired
	private StudentRepo sr;
	
	
	Logger logger= LoggerFactory.getLogger(HomeController.class);
	
	@PostMapping(value = "/postData")
	public ResponseEntity<?> firstRestApi(@Valid @RequestBody Student student)
	{
		logger.info("This is first API GET Call");
		
		Student stu = sr.save(student);
		
		return ResponseEntity.ok(stu);
	}
	
	@GetMapping(value = "/getData/{id}")
	//@CachePut(cacheNames = "OneIdData")
	//@CacheEvict(cacheNames = "OneIdData")
	@Cacheable(cacheNames = "OneIdData")
	public ResponseEntity<?> firstRestApi(@PathVariable("id") int i)
	{
		logger.info("This is first API GET Call");
		Student student = sr.findById(i).get();
		
		return ResponseEntity.ok(student);
	}
}
