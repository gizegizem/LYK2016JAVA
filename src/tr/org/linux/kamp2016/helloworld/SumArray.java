package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class SumArray {

	
	public static void main(String[] args) {
		int number;
		int number1;
		Scanner n =new Scanner(System.in);
		System.out.println("Kaç sayılık bir array istiyorsunuz ?");
		number=n.nextInt();
		int[] erey=new int[number];
		int  result=0;
		System.out.println("Lütfen toplamak istedğiniz sayıları giriniz...");
		for(int i=0;i < erey.length;i++){
			
			
			number1=n.nextInt();
			erey[i]=number1;
			result +=number1;
		}
		System.out.println(result);

	}

}
