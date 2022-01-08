package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Student name is Preetha");
	}
public void studentDept()
{
	System.out.println("Student Dept is Zoology ");
}
public void studentId()
{
	System.out.println("Student Id is 50001");
}
public static void main(String[] args) {
	Student details = new Student();
	details.collegeName();
	details.collegeCode();
	details.collegeRank();
	details.depName();
	details.studentName();
	details.studentDept();
	details.studentId();
}
}
