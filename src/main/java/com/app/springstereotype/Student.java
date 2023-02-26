package com.app.springstereotype;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("123")
	private int studentId;
	@Value("darshan")
	private String studentName;
	@Value("#{addref}")
	private List<String> studentAddress;

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

	public Student(int studentId, String studentName, List<String> studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public List<String> getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(List<String> studentAddress) {
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

	@PostConstruct
	public void init() {
		System.out.println("inside init method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method");
	}
}
