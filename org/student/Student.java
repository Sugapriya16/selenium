package org.student;

public class Student extends org.department.Department {
	
	public void studentName(String name) {
		System.out.println("Student Name is :"+ name);
	}
	
	public void studentDept(String dept) {
		System.out.println("Student Department is :"+ dept);
	}
	
	public void studentId(int id) {
		System.out.println("Student ID is :"+ id);
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName("Vel Tech");
		stud.collegeCode(11802520);
		stud.collegeRank(11);
		stud.departmentName("ECE Department");
		stud.studentName("Sugapriya");
		stud.studentId(112);
		stud.studentDept("ECE");
	}

}
