package tr.linux.kamp2016.inheritance;

public class Dog extends Mammal implements Carnivore{
	
	Dog(String name) {
		super(name);
		
	}
	public void bark(){System.out.println(name+" Köpek havlayabilir");}
	public void sniff(){System.out.println(name+" Köpek Koklayabilir");}
	
	@Override
	public void giveBirth(){System.out.println(name+" Köpek aynı anda tek çocuk doğurabilir.");}
	
	public void hunt(){
		System.out.println(name+" avlanır.");
	}
	@Override
	public void breath() {
		System.out.println(name+" Köpek dili dışarda nefes alır.");
		
	}
	@Override
	public void eat() {
		System.out.println(name+" Köpek arka dişleri ile yemek yer");
	}
	@Override
	public void sleep() {
		System.out.println(name+" Köpek oturarak uyur");
		
	}
}
