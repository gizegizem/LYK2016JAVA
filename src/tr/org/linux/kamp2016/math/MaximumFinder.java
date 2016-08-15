package tr.org.linux.kamp2016.math;

import java.util.Scanner;

import tr.org.linux.kamp2016.string.StringExample;

public class MaximumFinder {

	public static void main(StringExample[] args) {
		Scanner input = new Scanner(System.in);

		System.out
				.println("Lütfen aralarına boşuk koyarak 3 sayı tanımlayınız");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double result = maximum(number1, number2, number3);
		System.out.println("en büyük sayı: " + result);

	}

	public static double maximum(double x, double y, double z) {
		double maximumValue = x;
		if (y > maximumValue)
			maximumValue = y;
		if (z > maximumValue)
			maximumValue = z;
		
		return maximumValue;

	}
}
