package tr.org.linux.kamp2016.inheritance;

public class Owl extends Bird implements Carnivore{


	Owl(String name) {
		super(name);
		
	}

	public void rotateHead270Degrees(){System.out.println(name+" Baykuş kafasını 270 derece döndürebilir");}
	
	@Override
	public void fly(){System.out.println(name+" Baykuş uçabilir.");}
	
	public void hunt(){
		System.out.println(name+" avlanır.");
	}

	@Override
	public
	void breath() {
		System.out.println(name+" Baykuş ağzından nefes alır.");
		
	}
	@Override
	public
	void eat() {
		System.out.println(name+" Baykuş gagasıyla yemek yer");
	}

	@Override
	public
	void sleep() {
		System.out.println(name+" Baykuş ağaçta uyur");
		
	}
	
}
