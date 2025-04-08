package com.tca.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.beans.Student;
import com.tca.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		Student student = context.getBean(Student.class);
		
		student.display();
	}

}
