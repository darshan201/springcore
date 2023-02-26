package com.app.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// if we need to use registerShutdownHook()(like use destroy method) hook than
		// we need to do AbstractApplicationContext
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		context.registerShutdownHook();
		Student student = (Student) context.getBean("student");
		System.out.println(student.getStudentId());
		System.out.println(student.toString());
		student.getBooks();
		System.out.println(student.isIsactive());
	}
}
