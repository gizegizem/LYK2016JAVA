package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {

	public static void main(String[] args) {
		int number = 1;
		Scanner n = new Scanner(System.in);
		ArrayList<Integer> erey = new ArrayList<Integer>();
		System.out.println("Lütfen toplamak istedğiniz sayıları giriniz...");
		while (true) {
			number = n.nextInt();
			if (number == 0)
				break;
			
			erey.add(number);
		}
		System.out.println("Toplam: " + sumArray(erey));
	}

	public static int sumArray(ArrayList<Integer> erey) {
		int result = 0;

		/*
		 * for(int i=0;i<erey.size();i++){ result = erey.get(i) + result; }
		 */

		for (Integer i : erey) {
			result += i;
		}
		return result;
	}
}