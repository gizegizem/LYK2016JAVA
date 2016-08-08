package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Palindrom {

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
			
			for(int i=vocab.length()-1;i>=0;i--)
		      {
		         reverse += vocab.charAt(i); 
		      }
		      //System.out.println(reverse);
		      
		      if (vocab.equals(reverse))
		          answer=true;
		      
		return answer;
	}

}
