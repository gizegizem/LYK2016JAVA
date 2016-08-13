package tr.org.linux.kamp2016.inheritance;

public class Snake extends Reptile implements Carnivore,Herbivore{

	Snake(String name) {
		super(name);
		
	}

	public void poison(){System.out.println(name+" Yılan zehirleyebilir");}
	
	@Override
	public void clawl(){System.out.println(name+" Yılan sürünebilir.");}
	
	public void hunt(){
		System.out.println(name+" avlanır.");
	}

	@Override
	public
	void breath() {
		System.out.println(name+" Yılan nefes alır.");
		
	}
	@Override
	public
	void eat() {
		System.out.println(name+" Yılan dilinden yardım alarak ile yemek yer");
	}

	@Override
	public
	void sleep() {
		System.out.println(name+" Yılan kıvrılarak uyur");
		
	}

	@Override
	public void investigatePlants() {
		System.out.println(name+" ot arar,yer");
		
	}

}
