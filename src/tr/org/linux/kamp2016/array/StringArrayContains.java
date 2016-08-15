package tr.org.linux.kamp2016.array;

import java.util.Arrays;

public class StringArrayContains {

	
	public static void main(String[] args) {
		String[] strMonths = new String[]{"January","February","March","April","May","June","July","August",};
		String strFind1="March";
		String strFind2="September";
		boolean contains=false;
		
		/*for(int i=0;i<strMonths.length;i++){
			if(strMonths[i].equals(strFind1)){
				contains=true;
				break;
			}
		}*/
		if(contains){
			System.out.println("String array Stringi içeriyor "+strFind1);
		}
		else
			System.out.println("String array Stringi içeriyor "+strFind1);
		contains=Arrays.asList(strMonths).contains(strFind1);//asList olayı array sınıfına özgü bi şey görevi 
															//strMonths arrayini getirmeye yarıyor
		System.out.println("Array stringi içeriyor mu? "+strFind1+" "+contains);
		contains=Arrays.asList(strMonths).contains(strFind2);
		System.out.println("Array stringi içeriyor mu? "+strFind2+" "+contains);
	}

}
