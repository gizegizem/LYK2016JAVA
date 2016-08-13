package tr.org.linux.kamp2016.inheritance;

public class AnimalTest {
	
	public static void main(String args[]){
		
		
		Cat kedi1 = new Cat("boncuk","gri","mavi","efendi kedi",2);
		Cat kedi2 = new Cat("deli kedi","beyaz","yeşil","yaramaz kedi",3);
		Dog kopek = new Dog("tarçın");
		Snake yilan = new Snake("uyuz");
		Owl baykus = new Owl("gecekuşu");

		/*Animal o=kedi1;
		Carnivore c=kopek;
		Object a=kedi2;*/
		
		kedi1.eat();
		kedi1.claw();
		kedi2.meow();
		kedi2.sleep();
		kedi1.investigatePlants();
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
		System.out.println("Kedi1 Memeli mi?"+isMammal(kedi1));
		System.out.println("yılan memeli mi?"+isMammal(yilan));
	}	
	static boolean isMammal(Object obj){
		if(obj instanceof Mammal)
			return true;
		else
			return false;
	}
}
