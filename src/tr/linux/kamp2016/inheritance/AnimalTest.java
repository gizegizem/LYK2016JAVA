package tr.linux.kamp2016.inheritance;

public class AnimalTest {
	
	public static void main(String args[]){
		Cat kedi = new Cat("boncuk");
		Dog kopek = new Dog("tarçın");
		Snake yilan = new Snake("uyuz");
		Owl baykus = new Owl("gecekuşu");
		
		System.out.println("kedinin adı: " + kedi.getName());
		kedi.eat();
		kedi.claw();
		kedi.meow();
		kedi.sleep();
		
		System.out.println("Köpeğin adı: " + kopek.getName());
		kopek.bark();
		kopek.breath();
		kopek.sleep();
		kopek.giveBirth();
		
		System.out.println("Yılanın  adı: " + yilan.getName());
		yilan.poison();
		yilan.eat();
		
		System.out.println("Baykuşun adı: " + baykus.getName());
		baykus.breath();
		baykus.rotateHead270Degrees();
		

		

		

		

	}
}
