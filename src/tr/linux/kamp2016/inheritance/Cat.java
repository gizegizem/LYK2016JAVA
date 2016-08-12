package tr.linux.kamp2016.inheritance;

public class Cat extends Mammal implements Herbivare  {
	
	public String furColor;
	Cat(String name,String furColor) {
		super(name);
		this.furColor=furColor;
		
	}
public void claw(){System.out.println("Kedi Tırmayalabilir");}
public void meow(){System.out.println("Kedi Miyavlayabilir");}

@Override
public void giveBirth(){System.out.println("Kedi aynı andan birden fazla çocuk doğurabilir");}

public void investigatePlants(){
	System.out.println("ot arar,yer");
}
@Override
void breath() {
	System.out.println("Kedi Ağzıyla nefes alır.");
	
}
@Override
void eat() {
	System.out.println("Kedi ön dişleri ile yemek yer");
	
}
@Override
void sleep() {
	System.out.println("Kedi ayakta uyur");
	
}
}
