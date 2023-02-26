package com.app.springstereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		// if we need to use registerShutdownHook()(like use destroy method) hook than we need to do AbstractApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/app/springstereotype/studentfile.xml");
		context.registerShutdownHook();
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}
}
