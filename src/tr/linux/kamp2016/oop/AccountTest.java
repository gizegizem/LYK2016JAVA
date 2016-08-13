package tr.linux.kamp2016.oop;

import java.util.Scanner;

public class AccountTest {

	
	public static void main(String[] args) {
		int choose;
		int amount;
		Account customer = new Account(13290121);
		customer.deposit(250);
		customer.withDraw(150);
		customer.withDraw(300);
		customer.deposit(2500);
		
		
		/*System.out.println(customer.getId()+" nolu hesabınızın bakiyesi: "+customer.getBalance());
		System.out.println("Hangi işlemi yapmak istersiniz: 1-WithDrow 2-Deposit");
		Scanner input = new Scanner(System.in);
		choose = input.nextInt();
		
		if(choose==1){
			System.out.println("çekmek istediğiniz miktarı giriniz: ");
			System.out.println("Güncel bakiyeniz: "+customer.getBalance());
			amount = input.nextInt();
			customer.withDraw(amount);
		}
		else
		{
			System.out.println("yatırmak istediğiniz miktarı giriniz: ");
			amount = input.nextInt();
			customer.deposit(amount);
			System.out.println("Güncel bakiyeniz: "+customer.getBalance());
		}*/
		

	}

}
