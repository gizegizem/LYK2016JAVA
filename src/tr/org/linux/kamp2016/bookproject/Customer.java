package tr.org.linux.kamp2016.bookproject;

public class Customer {
	String userName;
	String userSurname;
	Purchase[] purchaseHistory=new Purchase[10];
	int purchaseCount;
	public Customer(String userName, String userSurname) {
		this.userName = userName;
		this.userSurname = userSurname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public int getPurchaseCount() {
		return purchaseCount;
	}
	public void setPurchaseCount(int purchaseCount) {
		this.purchaseCount = purchaseCount;
	}
	public boolean placePurchase(Purchase current){
		
		
	}
	public double getTotalAmountSpent(){
		
	}
	
}
