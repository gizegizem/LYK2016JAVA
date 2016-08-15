package tr.org.linux.kamp2016.helloworld;

import java.util.InputMismatchException;
import java.util.Scanner;

import tr.org.linux.kamp2016.string.StringExample;

public class Sphere {

	public static void main(StringExample[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kürenin Yarıçapını giriniz: ");
		try {
			double yaricap = input.nextDouble();
			System.out.println("Hacim: " + kureHacmi(yaricap));
		} catch (InputMismatchException e) {
			System.out.println("Başka bir şey değil, sayı gir.");
		}

	}

	public static double kureHacmi(double yaricap) {
		double hacim = (4.0 - 3.0) * Math.PI * Math.pow(yaricap, yaricap);
		return hacim;

	}

}
