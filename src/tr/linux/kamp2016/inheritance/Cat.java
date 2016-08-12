package tr.linux.kamp2016.inheritance;

public class Cat extends Mammal{
	String name;
	
public Cat(String name) {
		this.name = name;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
public void claw(){System.out.println("Tırmayalabilir");}
public void meow(){System.out.println("Miyavlayabilir");}
}
