package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen e-mail adresinizi giriniz: ");
		String email="mail";
		while(!email.isEmpty()){
			email =input.nextLine();
			if(!email.isEmpty()){
				if(isValidMail(email)){
					System.out.println("bu mail adresi valiid. ");
				}
				else
					System.out.println("bu mal adresi valid değil.");
			}
			
		}
		//System.out.println("Done!");
	}
	private static boolean isValidMail(String mail) {
		
		if (mail.contains(" ")) {
			return false;
		}

		if (!mail.contains("@")) {
			return false;
		}
		if (mail.startsWith("@") || mail.startsWith(".")) {
			return false;
		}
		if (!(mail.indexOf('@') +1 < mail.lastIndexOf('.'))) {
			return false;
		}
		if (!(mail.lastIndexOf('.')+2 <mail.length())){
			return false;
		}
		return true;

	}
}
