package tr.org.linux.kamp2016.projects;

import java.util.ArrayList;

public class Department {
	private String deptName;
	private String facultyName;
	ArrayList<Student> studentList = new ArrayList();

	// methods
	public void appendstudent(Student st) {
		studentList.add(st);
	}

	// constructor
	public Department(String deptName, String facultyName) {
		this.deptName = deptName;
		this.facultyName = facultyName;
	}

	// toString()
	@Override
	public String toString() {
		return "deptName=" + deptName + ", facultyName="
				+ facultyName;
	}

}
