package tr.org.linux.kamp2016.garbagecollector;

public class MyClass {

	int i;
	
	public MyClass(int i){
		this.i=i;
	}
	protected void finalize() throws Throwable{
		System.out.println("Finalize methodundan gelen i, i= "+ i);
		super.finalize();
	}
	public static void main(String[] args) {
		
	}

}
