package tr.linux.kamp2016.inheritance;

public class Snake extends Reptile implements Carnivare{

	Snake(String name) {
		super(name);
		
	}

	public void poison(){System.out.println("Yılan zehirleyebilir");}
	
	@Override
	public void clawl(){System.out.println("Yılan sürünebilir.");}
	
	public void hunt(){
		System.out.println("avlanır.");
	}

	@Override
	void breath() {
		System.out.println("Yılan nefes alır.");
		
	}
	@Override
	void eat() {
		System.out.println("Yılan dilinden yardım alarak ile yemek yer");
	}

	@Override
	void sleep() {
		System.out.println("Yılan kıvrılarak uyur");
		
	}

}
