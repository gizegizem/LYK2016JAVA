package tr.org.linux.kamp2016.helloworld;

public class BoxTest {

	
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.setT(new Integer(10));
		Integer someInteger = integerBox.getT();
		System.out.println(someInteger);
		

	}

}
