package com.app.springannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component()

public class Student {
	@Value("#{8>4?123:11}")
	private int studentId;
@Value("#{'darshan'+'patel'}")
	private String studentName;

	private String studentAddress;
	@Value("#{true}")
	 private boolean isactive;
	@Autowired
	private Book book;

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public Book getBooks() {
		return book;
	}

	public void setBooks(Book books) {
		this.book = books;
	}

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
