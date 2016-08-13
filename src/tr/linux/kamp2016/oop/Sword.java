package tr.linux.kamp2016.oop;

public class Sword extends Weapon {

	public Sword(double price, double weight, double damage) {
		super(price, weight, damage);
	}

	public boolean useItem() {
		System.out.println("The	Sword is used and caused damage of "
				+ getDamageAmount() + " points.");
		return true;
	}

	@Override
	public String toString() {
		return "Weapor's type = Sword, damageAmounts=" + getDamageAmount()
				+ ",price= " + getItemPrice() + ",weight= " + getItemWeight();
	}

}