package com.gmail.akv;

import java.util.Arrays;

import com.gmail.akv.exeptions.MyFirstEverException;

public class Group {
	private Student[] students = new Student[10];
	private String groupName;

	public Group(Student[] students, String groupName) {
		super();
		this.students = students;
		this.groupName = groupName;
	}

	public Group() {
		super();
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student st) throws MyFirstEverException {

		for (int i = 0; i < students.length;) {

			if (students[i] == null) {
				students[i] = st;
				break;
			}
			i++;
			if (i == students.length) {
				throw new MyFirstEverException("The group is full");
			}

		}

	}

	public void removeStudent(long studentNumber) {

		for (int i = 0; i < students.length; i++)
			if (students[i] != null) {
				if (students[i].getStudentNumber() == studentNumber) {
					students[i] = null;
					break;
				}
			}

	}

	public Student searchStudent(String familyName) {
		Student student = null;
		for (int i = 0; i < students.length; i++)
			if (students[i] != null ) {
				if (students[i].getFamilyName() == familyName) 
					student = students[i];
				}
		return student;

	};
	

	

	@Override
	public String toString() {
		return "Group [students=" + Arrays.toString(students) + ", groupName=" + groupName + "]";
	}

}
