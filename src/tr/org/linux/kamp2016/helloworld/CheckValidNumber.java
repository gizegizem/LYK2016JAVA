package tr.org.linux.kamp2016.helloworld;

public class CheckValidNumber {

	public static void main(String[] args) {
		String[] str = new String[] { "10.20", "1234", "12.at"};

		for (int i = 0; i < str.length; i++) {
			if (str[i].indexOf(".") > 0) {
				try {
					Double.parseDouble(str[i]);  //double olup olmadığını kontrol ediyor
					System.out.println(str[i] + "geçerli bir double sayı gir!");
				} catch (NumberFormatException nme) {
					System.out.println("geçerli değil...");
				}

			} else {
				try {
					Integer.parseInt(str[i]);  //ınteger olup olmadığını kontrl ediyor
					System.out.println(str[i] + "geçerli bir integer sayı gir!");
				} catch (NumberFormatException nme) {
					System.out.println("geçerli br sayı değil...");
				}
			}

		}

	}
}
