package tr.linux.kamp2016.inheritance;

public class AnimalTest {
	
	public static void main(String args[]){
		
		Cat kedi = new Cat("boncuk","gri");
		Dog kopek = new Dog("tarçın");
		Snake yilan = new Snake("uyuz");
		Owl baykus = new Owl("gecekuşu");
		
		System.out.println("kedinin adı: " + kedi.name);
		System.out.println("kedinin rengi: " + kedi.furColor);
		kedi.eat();
		kedi.claw();
		kedi.meow();
		kedi.sleep();
		kedi.investigatePlants();
		System.out.println("***********************************************");
		
		System.out.println("Köpeğin adı: " + kopek.name);
		kopek.bark();
		kopek.breath();
		kopek.sleep();
		kopek.giveBirth();
		kopek.hunt();
		kopek.eat();
		kopek.sniff();
		System.out.println("***********************************************");
		
		System.out.println("Yılanın  adı: " + yilan.name);
		yilan.poison();
		yilan.eat();
		yilan.hunt();
		yilan.clawl();
		System.out.println("***********************************************");
		
		System.out.println("Baykuşun adı: " + baykus.name);
		baykus.breath();
		baykus.rotateHead270Degrees();
		baykus.hunt();
		baykus.eat();
		baykus.fly();
		System.out.println("***********************************************");
		

		

		

		

	}
}
