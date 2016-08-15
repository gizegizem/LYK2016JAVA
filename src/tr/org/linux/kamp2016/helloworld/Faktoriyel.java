package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

import tr.org.linux.kamp2016.string.StringExample;

public class Faktoriyel {

	public static void main(StringExample[] args) {
		int inputNumber;
		Scanner input = new Scanner(System.in);
		System.out
				.println("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz...");
		inputNumber = input.nextInt();
		if (inputNumber < 0) {
			System.out.println("Lütfen Pozitif bir sayı giriniz...");
			inputNumber = input.nextInt();
			System.out.println(faktoriyel(inputNumber));
		}

		else
			System.out.println(faktoriyel(inputNumber));

	}

	public static int faktoriyel(int number) {

		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
}
