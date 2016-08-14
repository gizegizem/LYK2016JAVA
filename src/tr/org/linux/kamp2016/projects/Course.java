package tr.org.linux.kamp2016.projects;

import java.util.ArrayList;

public class Course {
	private Department department;
	private String name,instructorName;
	ArrayList<Student> registeredStudents = new ArrayList();

	// constructor
	public Course(Department department, String name,
			String instructorName) {
		this.department = department;
		this.name = name;
		this.instructorName = instructorName;
	}
	
	public void registerStudent(Student st) {
        registeredStudents.add(st); 
        department.appendstudent(st); 
	}

	// toString
	@Override
	public String toString() {
		return "Course " + department + ", name=" + name
				+ ", instructorName=" + instructorName;
	}

	// getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public Department getDepartment() {
		return department;
	}

	// setters
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public ArrayList<Student> getRegistratedStudents() {
		return registeredStudents;
	}

	public void setRegistratedStudents(ArrayList<Student> registratedStudents) {
		this.registeredStudents = registratedStudents;
	}

}
