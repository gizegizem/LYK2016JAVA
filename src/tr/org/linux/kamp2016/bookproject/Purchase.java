package tr.org.linux.kamp2016.bookproject;

public class Purchase extends ShoppingCart{
String purchaseDate;
String shippingDate;
int deliveryLength;
public Purchase(String purchaseDate, String shippingDate, int deliveryLength) {
	this.purchaseDate = purchaseDate;
	this.shippingDate = shippingDate;
	this.deliveryLength = deliveryLength;
}
public String getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(String purchaseDate) {
	this.purchaseDate = purchaseDate;
}
public String getShippingDate() {
	return shippingDate;
}
public void setShippingDate(String shippingDate) {
	this.shippingDate = shippingDate;
}
public int getDeliveryLength() {
	return deliveryLength;
}
public void setDeliveryLength(int deliveryLength) {
	if(this.deliveryLength>0)
	this.deliveryLength = deliveryLength;
}

public double getTotalPayment(){
	
}




}
