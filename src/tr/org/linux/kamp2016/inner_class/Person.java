package tr.org.linux.kamp2016.inner_class;

import java.util.ArrayList;
import java.util.Collection;

public class Person extends AbstractPerson {
	public class Money { // başka bir sınıfın içinde class yaptık.
		private int value;
		private Currency currency;

		public Money(int value, Currency currency) {
			// TODO Auto-generated constructor stub
			this.value = value;
			this.currency = currency;
		}

		public int getValue() {
			switch (currency) {
			case TL:
				return value;

			case DOLLAR:
				return value * exchangeRate;
			}
			return 0; // FIXME
		}

	}

	public enum Currency {
		TL, DOLLAR
	}
	private int exchangeRate = 3;
	private int age;
	private String name;
	private Collection<Money> moneyList = new ArrayList<>(); // Coolection yaptık amaç yapabildiğimiz  en yukardaki
															// tipi seçmelyiz bize faydası olur
	public Person(int age, String name,int exchangeRate) {
		super();
		this.age = age;
		this.name = name;
		this.exchangeRate = exchangeRate;
		System.out.println("Person constructor.");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMoney(int value, Currency currency) {
		moneyList.add(new Money(value, currency));

	}

	public void addMoney(Money m) {
		moneyList.add(m);

	}

	public int getTotalMoney() {
		int total = 0;
		for (Money m : moneyList) {
			total += m.getValue();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", money="
				+ getTotalMoney() + "]";
	}

}
