package tr.org.linux.kamp2016.bookproject;

public class HardCopyBook extends Book{
	double weight;
	double shippingCost;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	public HardCopyBook(String name, String author, double price,
			String bookId, double weight, double shippingCost) {
		super(name, author, price, bookId);
		this.weight = weight;
		this.shippingCost = shippingCost;
	}
	@Override
	public String toString() {
		return "HardCopyBook [weight=" + weight + ", shippingCost="
				+ shippingCost + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + ", getBookId()=" + getBookId()
				+ ", getAuthor()=" + getAuthor() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	public double getTotalCost(){
/***/		return getShippingCost()+getPrice();
	}
	
	
}
