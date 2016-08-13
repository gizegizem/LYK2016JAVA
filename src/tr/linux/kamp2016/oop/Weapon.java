package tr.linux.kamp2016.oop;

public class Weapon extends Item {
	private double damageAmount;

	public Weapon(double price, double weight, double damage) {
		super(price, weight);
		if (damageAmount < 0) {
			damageAmount = 0;
		} else
			damageAmount = damage;

	}

	public double getDamageAmount() {
		return damageAmount;
	}

	@Override
	public String toString() {
		return "Weapor's damageAmounts=" + damageAmount + ",price= "
				+ getItemPrice() + ",weight= " + getItemWeight();
	}

	@Override
	public boolean useItem() {
		if (getDamageAmount() > 0)
			return true;
		else
			return false;
	}
}