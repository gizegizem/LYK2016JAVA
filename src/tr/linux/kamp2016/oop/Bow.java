package tr.linux.kamp2016.oop;

public class Bow extends Weapon{
	private int numArrows;

	public Bow(double price,double weight,double damage,int numArrows) {
		super(price,weight,damage);
		if(numArrows >0)
			this.numArrows = numArrows;
			
		else
			numArrows=0;
	}

	public int getNumArrows() {
		return numArrows;
	}
	
	public boolean useItem(){
		if(numArrows >0){
			numArrows--;
			System.out.println("The Bows is used to throw an arrow and caused damage of "
					+getDamageAmount()+" points.");
			return true;}
		else
			return false;
	}
	public void upgrade(){
		numArrows +=10;
	}

	@Override
	public String toString() {
		return "Weapon type=Bow numArrows= " + numArrows +" damageAmounts= " 
				+ getDamageAmount() + ",price= "
				+getItemPrice()+",weight= "+getItemWeight();
	}
	
	

}
