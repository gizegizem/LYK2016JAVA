package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class IbanValidNumberHoca {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String iban = "ıban";
		while (!iban.isEmpty())
		{
			System.out.println("Lütfen ıban numarasını giriniz: ");
			iban = input.nextLine();
			if(!(iban.isEmpty())){
				String countryCode = iban.substring(0, 2);
				String controlCode = iban.substring(2, 4);
				String bankCode = iban.substring(4, 9);
				String accountCode = iban.substring(10, 26);
				System.out.println("Country Code: "+ countryCode );
				System.out.println("Control Code: "+ controlCode );
				System.out.println("Bank Code: "+bankCode);
				System.out.println("Account Number:"+accountCode);
				if(iban.length()>=26)
				{
					System.out.println("Iban length is invalid.");
				}
				if(!(countryCode.equals("TR")))
				{
					System.out.println("This is not TR Iban");
				}	
				if(!(digitControl(countryCode)))
				{
					System.out.println("This Iban is invalid.");
				}	
				if(!(digitControl(bankCode)))
				{
					System.out.println("This Iban is invalid.");
				}	
				if(!(digitControl(accountCode)))
				{
					System.out.println("This Iban is invalid.");
				}	
			}
		}

	}
	public static boolean digitControl(String str){
		for(int i=0;i<str.length();i++){
			if(!(Character.isDigit(str.charAt(i)))){
				return false;
			}
	   }
	
	return true;
	}

}
