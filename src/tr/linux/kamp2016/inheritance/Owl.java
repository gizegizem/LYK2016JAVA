package tr.linux.kamp2016.inheritance;

public class Owl extends Bird implements Carnivare{


	Owl(String name) {
		super(name);
		
	}

	public void rotateHead270Degrees(){System.out.println("Baykuş kafasını 270 derece döndürebilir");}
	
	@Override
	public void fly(){System.out.println("Baykuş uçabilir.");}
	
	public void hunt(){
		System.out.println("avlanır.");
	}

	@Override
	void breath() {
		System.out.println("Baykuş ağzından nefes alır.");
		
	}
	@Override
	void eat() {
		System.out.println("Baykuş gagasıyla yemek yer");
	}

	@Override
	void sleep() {
		System.out.println("Baykuş ağaçta uyur");
		
	}
	
}
