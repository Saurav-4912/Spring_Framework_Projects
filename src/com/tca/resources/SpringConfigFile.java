package com.tca.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tca.beans.Address;
import com.tca.beans.Student;
import com.tca.beans.Subjects;

@Configuration
public class SpringConfigFile {

	@Bean("addID")
	public Address add() {
		
		Address address = new Address();
		address.setHouseNo(999);
		address.setCity("Pune");
		address.setPincode(8787);
		return address;
		
	}
	
	@Bean("subID")
	public Subjects createSub() {
		Subjects subjects = new Subjects();
		
		List<String> L = new ArrayList<>();
		L.add("Java");
		L.add("C++");
		L.add("Python");
		
		subjects.setSubjects(L);
		
		return subjects;
	}
	
	@Bean("stdID")
	public Student createStd() {
		
		Student student = new Student();
		student.setRno(456);
		student.setName("Sachin");
		// student.setAddress(add());  // Manually Dependency
		//student.setSubjects(createSub()); // Manually Dependency
		return student;
	}
}
