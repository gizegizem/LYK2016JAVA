package tr.org.linux.kamp2016.helloworld;

public class Animall {
	private String name;
	private int age;
	private  String type;
	
	public Animall(String name,int age,String type)
	{
		this.name=name;
		
		if(age>0 && age<100)
			this.age=age;
		
		this.type=type;
	}
	public String getName(){
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getType()
	{
		return type;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		if(age>0 && age<100)
			this.age=age;
		else
			this.age=-1;
	}
	
	
	public String toString() {
		return "Adı:" + name + " Yaşı:" + age + " Türü: " + type;
	}
	public void setType(String type)
	{
		this.type=type;
	}

}
