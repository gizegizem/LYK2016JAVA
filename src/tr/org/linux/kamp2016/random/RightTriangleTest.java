package tr.org.linux.kamp2016.random;

import java.util.Random;

import tr.org.linux.kamp2016.string.StringExample;

public class RightTriangleTest {

	public static int randomIntegerRandom(int min, int max) {
		Random rgen = new Random();
		int range = (int) (Math.abs(max - min) + 1);
		int random =(int) (min + rgen.nextInt(range));
		return random;
	}
	public static void main(StringExample[] args) {
		
		/*RightTriangle obje=new RightTriangle(8,15);
		System.out.println("Hipotenüs: " + obje.hypotenuse());
		System.out.println("Çevre: " + obje.perimeter());
		System.out.println("Alan: " + obje.area());*/
		
		for(int i=1;i<11;i++)
		{
			int randomNumber1 = randomIntegerRandom(1, 50);
			int randomNumber2 = randomIntegerRandom(1, 50);
			RightTriangle obje=new RightTriangle(randomNumber1,randomNumber2);
			System.out.println(i+ "- " + obje);
			
			/*System.out.println("sayı1: " + randomNumber1);
			System.out.println("sayı2: " + randomNumber2);
			System.out.println("Hipotenüs: " + obje.hypotenuse());
			System.out.println("Çevre: " + obje.perimeter());
			System.out.println("Alan: " + obje.area());*/	
			
		}

	}

}
