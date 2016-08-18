package tr.org.linux.kamp2016.data;

public class Application {
	public static void main(String[] args) {
		User u1 = new User("John","Will","Bill");
		User u2 = new User("Deniz","Yılmaz","Hakan");

		User u4 = new User("Deniz","Yılmaz","Hakan");
			System.out.println(u2==u4);
			System.out.println(u2.equals(u4));
			
			
			
			
	}

	
}
