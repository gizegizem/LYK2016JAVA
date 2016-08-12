package tr.linux.kamp2016.inheritance;

public class Snake extends Reptile{
	String name;
	
	public Snake(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void poison(){System.out.println("zehirleyebilir");}

}
