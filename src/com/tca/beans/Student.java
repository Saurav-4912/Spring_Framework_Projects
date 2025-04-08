package com.tca.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rno;
	private String name;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subjects subjects;

	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display() {
		System.out.println("Roll Number : " + rno);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Subjects : " + subjects);
	}
}
