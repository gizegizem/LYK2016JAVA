package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	
	public static void main(StringExample[] args) {
		/*int a=1;
		int b=5;
		int c=6;
		int total1=a+b+c;
		int[] erey=new int[3];
		erey[0]=a;
		erey[1]=b;
		erey[2]=c;
		int total2=erey[0]+erey[1]+erey[2];
		System.out.println("total: "+total1);
		System.out.println("total: "+total2);
		
		
		int[] erey2=new int[ ] {1,5,6};
		int total3=4;
		for(int i=0;i<erey.length;i++){
			total3=total3+erey2[i];
			
		}
		System.out.println("total: "+total3);*/
		
		////////////////////////////////////////////////////////////////
		
		/*Scanner input=new Scanner(System.in);
		System.out.println("Bir değer giriniz: ");
		int inputNumber=input.nextInt();
		int[] erey5=new int[10];
		int counter=0;
		while(inputNumber !=-1){
			System.out.println("Bir değer giriniz: ");
			if(inputNumber !=-1)
			{
			erey5[counter]=inputNumber;
			}
			inputNumber =input.nextInt();
			
			counter++;
			
		}
		for(int i=0;i<erey5.length;i++){
			System.out.println("Arrayin "+i+"'inci elemanı "+erey5[i]);
		}*/
		
		/////////////////////////////////////////////////////////////////////////
		
		/*Scanner input=new Scanner(System.in);
		System.out.println("Bir değer giriniz: ");
		String inputString=input.next();
		String[] erey5=new String[10];
		int counter=0;
		while(! inputString .equals("çıkış")){
			System.out.println("Bir değer giriniz: ");
			if(! inputString .equals("çıkış"))
			{
			erey5[counter]=inputString;
			}
			inputString =input.next();
			
			counter++;
			
		}
		for(int i=0;i<erey5.length;i++){
			System.out.println("Arrayin "+i+"'inci elemanı "+erey5[i]);
		}*/
		
		////////////////////////////////////////////////////////////////////////////
		
		/*Scanner input=new Scanner(System.in);
		System.out.println("Bir değer giriniz: ");
		int inputNumber=input.nextInt();
		int[] erey5=new int[10];
		int counter=0;
		while(inputNumber !=-1){
			System.out.println("Bir değer giriniz: ");
			if(inputNumber !=-1)
			{
			erey5[counter]=inputNumber;
			}
			inputNumber =input.nextInt();
			int[] erey6=new int[counter+1];
			System.arraycopy(erey5,0,erey6,0,erey5.length);
			
			counter++;
			
		}
		for(int i=0;i<erey5.length;i++){
			System.out.println("Arrayin "+i+"'inci elemanı "+erey5[i]);
		}*/
		
		/////////////////////////////////////////////////////////////////////////////
		
		/*Scanner input=new Scanner(System.in);
		System.out.println("Bir değer giriniz: ");
		int inputNumber=input.nextInt();
		ArrayList ereylist5=new ArrayList();
		int counter=0;
		while(inputNumber !=-1){
			System.out.println("Bir değer giriniz: ");
			if(inputNumber !=-1)
			{
			ereylist5.add(inputNumber);
			}
			inputNumber =input.nextInt();
			
			counter++;
			
		}
		for(int i=0;i<ereylist5.size();i++){
			System.out.println("Array listin "+i+"'inci elemanı "+ereylist5.get(i));
		}*/
		
	}

}
