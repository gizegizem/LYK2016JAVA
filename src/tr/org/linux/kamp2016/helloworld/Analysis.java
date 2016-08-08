package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Analysis {

	
	public static void main(StringExample[] args) {
		Scanner input=new Scanner(System.in);
		int passes= 0;
		int failures =0;
		int studentCounter =1;
		
		while(studentCounter <=10){
			System.out.println("sonucu giriniz (1=geçti, 2=kaldı)");
			int result =input.nextInt();
			
			if(result ==1){
				passes =passes +1;
				studentCounter =studentCounter + 1;
			}
			else if(result ==2){
				failures =failures + 1;
				studentCounter =studentCounter + 1;
			}
			else
				System.out.println("Lütfen '1 'ya da '2' olarak girin.");
			
		}
		System.out.println("Geçen: "+passes + "Kalan: " +failures);
		
		if(passes >8)
			System.out.println("Eğitmene afferim!");
		

	}

}
