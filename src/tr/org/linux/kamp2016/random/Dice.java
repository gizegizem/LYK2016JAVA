package tr.org.linux.kamp2016.random;

import java.util.Random;


public class Dice {

	private int faceValue;
	
	public Dice() {
		
		faceValue=1;	
	}
	
	public int roll(){
		int dice= RandomTest.randomIntegerRandom(1, 6);
		faceValue=dice;
		return faceValue;
	}
	
	public int getFaceValue() {
		return faceValue;
	}

	/*public static int randomIntegerRandom(int min, int max) {
		Random rgen = new Random();
		int range = (int) (Math.abs(max - min) + 1);
		int random =(int) (min + rgen.nextInt(range));
		return random;
	}*/
	
}
