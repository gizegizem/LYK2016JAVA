package tr.linux.kamp2016.inheritance;

public class Owl extends Bird{
	String name;

	public Owl(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void rotateHead270Degrees(){System.out.println("kafasını 270 derece döndürebilir");}
	
}
