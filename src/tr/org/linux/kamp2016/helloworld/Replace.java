package tr.org.linux.kamp2016.helloworld;

public class Replace {

	public static void main(String[] args) {
		String str="Grapon Kağıtları";
		System.out.println(str.replace("Gr", "Ka")); //string de iki ayrı bloğu değiştirir
		System.out.println(str.replaceFirst("Gr", "Grr")); // bu ilk bulduğunu değiştirir
		System.out.println(str.replaceAll("Gr", "Ha")); //ne kadar gr varsa değiştirir
		

	}

}
