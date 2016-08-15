package tr.org.linux.kamp2016.helloworld;

import tr.org.linux.kamp2016.string.StringExample;

public class DoWhile {

	public static void main(StringExample[] args) {
		int counter = 1;
		do {
			System.out.println(counter);
			++counter;
		} while (counter <= 10);

	}

}
