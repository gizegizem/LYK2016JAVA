package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class SumArray {

	public static void main(StringExample[] args) {
		int number;
		int number1;
		Scanner n = new Scanner(System.in);
		System.out.println("Kaç sayılık bir array istiyorsunuz ?");
		number = n.nextInt();
		int[] erey = new int[number];
		int result = 0;
		System.out.println("Lütfen toplamak istedğiniz sayıları giriniz...");

		for (int i = 0; i < erey.length; i++) {

			number1 = n.nextInt();
			erey[i] = number1;
			result += number1;
		}
		System.out.println(result);

		/*
		 * for (int i = 0; i < erey.length; i++) {
		 * 
		 * erey[i] = i; }
		 * 
		 * for(int i=0;i < erey.length;i++){
		 * 
		 * System.out.println(erey[i]); }
		 * 
		 * for (int i = 0; i < (number) / 2; i++) { int temp = erey[i]; erey[i]
		 * = erey[number-1- i]; erey[number - i] = temp; } for (int i = 0; i <
		 * erey.length; i++) {
		 * 
		 * System.out.println(erey[i]); }
		 */
	}
}
