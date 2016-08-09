package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class IbanValidNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String iban = "ıban";
		while (!iban.isEmpty()) {
			System.out.println("Lütfen Iban numarasını giriniz: ");
			iban = input.nextLine();
			if (validIbanNumber(iban)) {
				print(iban);
			} else
				System.out.println("Invalid iban numarası.");
		}
	}

	private static boolean validIbanNumber(String ibann) {
		if (!(ibann.length() == 26)) {
			return false;
		}
		if (!(ibann.startsWith("TR"))) {
			return false;
		}
		for (int i = 2; i <= ibann.length(); i++) {
			char control = ibann.charAt(i);
			if ((Character.isDigit(control)))
				;
			{
				return true;
			}
		}

		return true;
	}

	private static void print(String iiban) {
		System.out
				.println("Country Code: " + iiban.charAt(0) + iiban.charAt(1));
		System.out
				.println("Control Code: " + iiban.charAt(2) + iiban.charAt(3));
		System.out.print("Bank Code: ");
		for (int i = 4; i < 9; i++) {
			System.out.print(iiban.charAt(i));
		}
		// System.out.println("\nRezerve Number: "+ iiban.charAt(9));
		System.out.print("\nAccount Number:");
		for (int i = 10; i < 26; i++) {
			System.out.print(iiban.charAt(i));
		}
		System.out.println();
	}
}