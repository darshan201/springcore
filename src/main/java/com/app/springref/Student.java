package com.app.springref;

import java.util.List;

public class Student {
	private int studentId;
	private Teacher teacher;
	private List<String> studentFullname;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", teacher=" + teacher;
	}

	public String toprint() {
		return "Student [studentId=" + studentId + ", teacher=" + teacher + ", studentFullname=" + studentFullname
				+ "]";
	}

	public Student() {

	}

	public Student(int studentId, Teacher teacher, List<String> studentFullname) {

		this.studentId = studentId;
		this.teacher = teacher;
		this.studentFullname = studentFullname;

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
