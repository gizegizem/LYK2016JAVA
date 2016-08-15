package tr.org.linux.kamp2016.inner_class;

import tr.org.linux.kamp2016.inner_class.Person.Currency;
import tr.org.linux.kamp2016.inner_class.Person.Money;

public class Application {

	public static void main(String[] args) 
	{
		//differentExchangeRate();
		nullPointerEx(new Person(13,null,2));
		/*Person p1 = new Person(20, "Gizem");
		//usage with static inner class
		//Money m= new Money(15,Currency.DOLLAR);
		
		
		//usage with non-static inner class
		Money m=p1.new Money(10,Currency.DOLLAR);
		p1.addMoney(m);
		p1.addMoney(10,Currency.TL);
		p1.addMoney(20,Currency.TL);
		
		
		System.out.println(p1.toString());*/
	}
	/*private static void differentExchangeRate()
	{
		Person gizem= new Person(20, "Gizem",4);
		Person ege = new Person(21, "Ege",3);
		
		Money m1=gizem.new Money(10,Currency.DOLLAR);
		gizem.addMoney(m1);
		gizem.addMoney(10,Currency.TL);
		gizem.addMoney(20,Currency.TL);
		System.out.println(gizem.toString());
		Money m2=ege.new Money(10,Currency.DOLLAR);
		ege.addMoney(m2);
		ege.addMoney(10,Currency.TL);
		ege.addMoney(20,Currency.TL);
		System.out.println(ege.toString());
	}*/
	private static void nullPointerEx(Person person){
		//Money p = person.new Money(10,Currency.DOLLAR);
		//Person p2 = null;
		System.out.println(person.getName().length());
	}
}
