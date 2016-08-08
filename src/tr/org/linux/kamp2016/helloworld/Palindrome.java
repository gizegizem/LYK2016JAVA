package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Palindrome {

	
	
	public static void main(String[] args) {
		System.out.println("Kelimeyi giriniz: ");
		Scanner input= new Scanner(System.in);
		String kelime=input.nextLine();
		System.out.println(isPalindrome(kelime));

	}
	public static boolean isPalindrome(String vocab){
		boolean answer =false;
			String reverse ="";

			//System.out.println(vocab);
			
			for(int i=0;i<vocab.length();i++)
		      {
		         reverse = vocab.charAt(i)+reverse; 
		      }
		      System.out.println(reverse);
		      
		      if (vocab.equals(reverse))
		          answer=true;
		      
		return answer;
	}

}
