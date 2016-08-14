package tr.org.linux.kamp2016.projects;

public class StudentTest {
	public static void main(String args[]){
	Student ogrenci1 = new Student("GİZEM", "04001");
	Student ogrenci2 = new Student("EGE", "04002", "Fall", 201);

	Department dep1 = new Department("Bilgisayar Mühendisliği", "Mühendislik Fakültesi");
	dep1.appendstudent(ogrenci1);
	dep1.appendstudent(ogrenci2);

	
	Course calculus = new Course(dep1,"Calculus","Sevda Sağıroğlu");
	System.out.println(calculus.toString());
	
	
	}
	
}
