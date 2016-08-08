package tr.org.linux.kamp2016.helloworld;

import java.util.Arrays;

public class CompareArrays {

	
	public static void main(StringExample[] args) {
		int[] intArray1=new int[]{4,8,15,16,23,42};
		int[] intArray2=new int[]{4,8,15,16,23,42};
		boolean blnResult=Arrays.equals(intArray1,intArray2);
		System.out.println("iki array eşit mi? " +blnResult);

	}

}
