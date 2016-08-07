package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;

public class AnimallTest {

	public static void main(String[] args) {
		Animall animal1 = new Animall("Pamuk", 25, "Van Kedisi");
		System.out.println("Hayvanın adı: " + animal1.getName() + " Yaşı: "
				+ animal1.getAge() + " Cinsi: " + animal1.getType());
		animal1.setName("Maviş");
		animal1.setAge(500);
		animal1.setType("British Shorthair");

		System.out.println("Hayvanın adı: " + animal1.getName() + " Yaşı: "
				+ animal1.getAge() + " Cinsi: " + animal1.getType());

		
		/*Animall animal2 = new Animall("Çomar", 2, "Golden");
		System.out.println("Hayvanın adı: " + animal2.getName() + " Yaşı: "
				+ animal2.getAge() + " Cinsi: " + animal2.getType());
		animal2.setName("Garip");
		animal2.setAge(50);
		animal2.setType("Bulldog");
		System.out.println("Hayvanın adı: " + animal2.getName() + " Yaşı: "
				+ animal2.getAge() + " Cinsi: " + animal2.getType());*/
		
		System.out.println(animal1.toString());
		
		ArrayList erreyList =new ArrayList();
		erreyList.add(animal1);
		//erreyList.add(animal2);
		for(int i=0;i<erreyList.size();i++)
		{
			System.out.println(erreyList.get(i));
		}
		
		
	}

}
