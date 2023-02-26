package com.app.springref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTeacher {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/springref/studentfile.xml");
		Teacher teacher = (Teacher) context.getBean("teacherref");
		System.out.println(teacher);

		Student student = (Student) context.getBean("studentref");
		System.out.println(student);

		Student studentconstuctor = (Student) context.getBean("conref");
		System.out.println(studentconstuctor.toprint());

	}

}
