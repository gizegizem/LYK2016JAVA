package tr.org.linux.kamp2016.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User implements Comparable<User>{
	private String name;
	private String lastName;
	private String fathersName;
	private int age;
	
	
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(User o) {
		if(this.age > o.getAge()){
			return 1;
		}
		else if(this.age <o.getAge()){
			return -1;
		}
		else
		{
			return name.compareTo(o.name);
		}
		
	}
}


