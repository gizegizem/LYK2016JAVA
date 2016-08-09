package tr.org.linux.kamp2016.helloworld;

import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		while(true)
		{
			System.out.println("Please enter a string to count lettrs.");
			String str=input.nextLine();
			if(str.isEmpty())
				break;
			HashMap<Character,Integer> map = new HashMap<Character,Integer>();
			String str2=str.toLowerCase();
			for(int i=0;i<str2.length();i++)
			{
				if(Character.isLetter(str2.charAt(i)))
				{
					if(map.containsKey(str2.charAt(i)))
					{
						
					map.put(str2.charAt(i), map.get(str2.charAt(i))+1); 		//2.harf gördükten sonra eski indexini 
																			//1 artırıyor.
					}
					else
					{
						map.put(str2.charAt(i), 1);		//burda half ilk kez karşımıza geliyormuş gibi 
														//yaptık onun için 1 veriyoruz değeri direk
					}
				}	
			}
			System.out.println(map.toString());
		}
		System.out.println("Done!");
	}
		
}
