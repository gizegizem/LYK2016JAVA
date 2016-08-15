package tr.org.linux.kamp2016.math;

import tr.org.linux.kamp2016.string.StringExample;

public class MinNumber {

	
	public static void main(StringExample[] args) {
		int a=8;
		int b=10;
		int c= minFuction(a, b);

	}
	
 public static int minFuction(int num1,int num2){
	 int min;
	 if(num1>num2)
		 min=num2;
	 else
		 min=num1;
	 return min;
 }
}
