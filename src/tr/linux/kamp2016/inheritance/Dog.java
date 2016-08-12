package tr.linux.kamp2016.inheritance;

public class Dog extends Mammal{
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void bark(){System.out.println("havlayabilir");}
	public void sniff(){System.out.println("Koklayabilir");}
}
