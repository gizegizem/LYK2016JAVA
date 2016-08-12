package tr.linux.kamp2016.inheritance;

import java.util.ArrayList;

public abstract class Animal {
	String name;
		
	Animal() { }
	Animal(String name) {
		this.name = name;
	}
	abstract void breath();
	abstract void eat();
	abstract void sleep();	

}
