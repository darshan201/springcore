package com.app.springautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClassRoom {
	//autowire work for  dependency injection automatic  by the qualifier we can define with name of bean 
//	@Autowired
	//@Qualifier("student")
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "ClassRoom [student=" + student + "]";
	}

	public ClassRoom(Student student) {
		super();
		this.student = student;
	}

	public ClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

}
