package tr.org.linux.kamp2016.projects;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
	private String name, id, semester;
	private int year;
	private static int currentYear = LocalDate.now().getYear();
	private static int currentSemester=1;

	// get methods
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getSemester() {
		return semester;
	}

	public int getYear() {
		return year;
	}

	public static int getCurrentYear() {
		return currentYear;
	}

	public static int getCurrentSemester() {
		return currentSemester;
	}

	// set methods
	public void setSemester(String semester) {
		if(semester=="null" || semester.isEmpty()){
			this.semester="Fall";
		}
		if (semester.equals("Fall") || semester.equals("Spring")
				|| semester.equals("Summer")) {
			this.semester = semester;
		}
		else
			this.semester = "Fall";
	}

	public void setYear(int year) {
		if(year<0)
			this.year=1900;
		else
			this.year = year;
	}

	public static void setCurrentYear(int currentYear) {
		Student.currentYear = currentYear;
	}

	public static void setCurrentSemester(int currentSemester) {
		if (currentYear >= 0 && currentYear <=2) {
			Student.currentSemester = currentSemester;
		} else
			currentYear = 0;
	}

	// constructors
	public Student(String name, String Id) {
		if(Id.length()==5){
			//int id=Id.
		}
		this.name = name;
		this.id = id;
		getCurrentYear();
		getCurrentSemester();
	}

	public Student(String name, String id, String semester, int year) {
		this.name = name;
		this.id = id;
		this.semester = semester;
		this.year = year;
	}

	// toString() method
	@Override
	public String toString() {
		return "Student name=" + name + ", id=" + id + ", semester=" + getSemester()
				+ ", year=" + getYear();
	}

}
