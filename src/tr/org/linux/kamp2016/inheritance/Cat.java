package tr.org.linux.kamp2016.inheritance;

public class Cat extends Mammal implements Herbivore  {
	String furColor;
	String catPsychology;
	String eyeColor;
	int age;
	Cat(String name,String catPsychology,String furColor,String eyeColor,int age) {
		super(name);
		this.furColor=furColor;
		this.catPsychology=catPsychology;
		this.eyeColor=eyeColor;
		this.age=age;
	}
public void claw(){System.out.println(name +" Tırmayalabilir");}
public void meow(){System.out.println( name +" Miyavlayabilir");}

@Override
public void giveBirth(){System.out.println(name+" Kedi aynı andan birden fazla çocuk doğurabilir");}

public void investigatePlants(){
	System.out.println(name+" ot arar,yer");
}
@Override
public void breath() {
	System.out.println(name+" Kedi Ağzıyla nefes alır.");
	
}
@Override
public void eat() {
	System.out.println(name+" Kedi ön dişleri ile yemek yer");
	
}
@Override
public void sleep() {
	System.out.println(name+" Kedi ayakta uyur");
	
}
}
