package com.app.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public int getStudentId() {
		return studentId;
	}

	public Student() {
		super();

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
@PostConstruct
	public void init() {
		System.out.println("inside init method");
	}
@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method");
	}
}
