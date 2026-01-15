package com.validation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.annotation.Validated;

@Entity
@Validated
@Cacheable
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	@NotBlank(message = "This field cannot be blank")
	@NotNull(message = "This field cannot be null")
	private String sname;
	
	private double marks;
	
	@Size(max = 20, message = "Address length should be less than 20")
	private String saddress;
	
	@Min(value = 18, message = "Age should be at least 20")
	//@Pattern(regexp = "[0-9]")
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, double marks, String saddress, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.saddress = saddress;
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", saddress=" + saddress + ", age="
				+ age + "]";
	}
	
	
	
}
