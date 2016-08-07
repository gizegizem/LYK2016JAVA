package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class AccountTest {

	public static void main(String args[]) {
		Account account1 = new Account("Ali Veli", 50.00);

		System.out.println(account1.getName() + "'in Bakiyesi "
				+ account1.getBalance() + "TL ");

		Scanner input = new Scanner(System.in);

		System.out.println("Yatırmak İstediğiniz Para Miktarını Girin");

		double depositAmount = input.nextDouble();
		System.out.println(depositAmount + "TL " + account1.getName()
				+ " Kişisinin Hesabına Ekleniyor...");

		account1.deposit(depositAmount);

		System.out.println(account1.getName() + "'in Bakiyesi "
				+ account1.getBalance() + "TL ");
	}

}
