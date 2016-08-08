package tr.org.linux.kamp2016.helloworld;

public class StaticTest {

public static void main(String args[]) {
		StaticExample.setTestValue(5);
		StaticExample.testString = "Hello";
		System.out.println(StaticExample.getTestString());
		System.out.println("Test Value: "+ StaticExample.getTestValue());
		
	}

}
