package tr.linux.kamp2016.inheritance;

public class Dog extends Mammal implements Carnivare{
	
	Dog(String name) {
		super(name);
		
	}
	public void bark(){System.out.println("Köpek havlayabilir");}
	public void sniff(){System.out.println("Köpek Koklayabilir");}
	
	@Override
	public void giveBirth(){System.out.println("Köpek aynı anda tek çocuk doğurabilir.");}
	
	public void hunt(){
		System.out.println("avlanır.");
	}
	@Override
	void breath() {
		System.out.println("Köpek dili dışarda nefes alır.");
		
	}
	@Override
	void eat() {
		System.out.println("Köpek arka dişleri ile yemek yer");
	}
	@Override
	void sleep() {
		System.out.println("Köpek oturarak uyur");
		
	}
}
