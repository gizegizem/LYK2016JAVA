package tr.linux.kamp2016.oop;

public class Armor extends Item implements Upgrade {

	private double defencePoints;
	private boolean isWorn;

	public Armor(double price, double weight, double defencePoints) {
		super(price, weight);
		if (defencePoints > 0) {
			this.defencePoints = defencePoints;
		} else
			defencePoints = 0;
		isWorn = false;
	}

	public double getDefencePoints() {
		return defencePoints;
	}

	public boolean getIsWorn() {
		return isWorn;
	}

	public boolean useItem() {
		isWorn = true;
		return true;
	}

	@Override
	public String toString() {

		return "Armor's defencePoints=" + getDefencePoints() + ",price= "
				+ getItemPrice() + ",weight= " + getItemWeight();
	}

	public double getHit(double damagePoints) /** asdfgh */
	{
		if (getIsWorn()) {
			if (getDefencePoints() >= damagePoints) {
				defencePoints -= damagePoints;
				return 0;
			}
			if (getDefencePoints() < damagePoints) {
				defencePoints = 0;
				return damagePoints - getDefencePoints();
			}
		}
		return damagePoints;

	}

	public void upgrade() {
		defencePoints += 100;
	}
}