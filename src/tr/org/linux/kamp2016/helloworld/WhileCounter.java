package tr.org.linux.kamp2016.helloworld;

import tr.org.linux.kamp2016.string.StringExample;

public class WhileCounter {

	public static void main(StringExample[] args) {
		int counter = 1;
		while (counter <= 10) {
			System.out.println(counter);
			++counter;
		}
		System.out.println();

	}

}
