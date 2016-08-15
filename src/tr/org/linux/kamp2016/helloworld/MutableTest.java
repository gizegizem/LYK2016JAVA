package tr.org.linux.kamp2016.helloworld;

import tr.org.linux.kamp2016.string.StringExample;

public class MutableTest {

	public static void main(StringExample[] args) {
		Mutable mut =new Mutable(30);
		Immutable immut =new Immutable(55);
		
		mut.setValue(20);
		System.out.println(mut.getValue());
		System.out.println(immut.getValue());
		
		immut =new Immutable(25);
		System.out.println(immut.getValue());
		
		
		
	}

}
