package tr.org.linux.kamp2016.helloworld;

public class StringExample {

	public static void main(String[] args) {
		String s1 = new String("ofis çiftcinin kara gün dostudur");
		if (s1.equals("ofis çiftcinin kara gün dostudur"))
			System.out.println("eşit");
		else
			System.out.println("eşit değil");
		if (s1.contains("kara"))
			System.out.println("içeriyor");
		else
			System.out.println("içermiyor");

		String s2 = new String("A");
		String s3 = new String("a");
		String s4 = new String("B");
		String s5 = new String("A");
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		System.out.println(s2.compareTo(s5));
		System.out.println(s2.compareTo(s4));

	}

}
