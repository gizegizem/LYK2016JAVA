package tr.org.linux.kamp2016.math;

import java.util.Scanner;

import tr.org.linux.kamp2016.string.StringExample;

public class Fibonacci {

	public static void main(StringExample[] args) 
	{
		int inputNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("Sayıyı giriniz: ");
		inputNumber = input.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 2; i <inputNumber; i++) 
		{	
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	
	}
}
