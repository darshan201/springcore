package com.app.springref;

public class Teacher {
	private int teacherId;

	public int getTeacherId() {
		return teacherId;
	}

	public Teacher(int teacherId) {
		super();
		this.teacherId = teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + "]";
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
}