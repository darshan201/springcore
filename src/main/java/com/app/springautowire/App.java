package com.app.springautowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// if we need to use registerShutdownHook()(like use destroy method) hook than
		// we need to do AbstractApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/app/springautowire/studentfile.xml");
		context.registerShutdownHook();
//		Student student = (Student) context.getBean("studentbean");
//		System.out.println(student);
		ClassRoom classroom = context.getBean("classstudent", ClassRoom.class);
		System.out.println(classroom);
	}
}
