package tr.linux.kamp2016.oop;

public class Account {
	private double balance;
	private int id=0;

	
	public Account(int id) {
		balance=0;
		this.id = id;
	}
	
	public void withDraw(double amount){
		if(balance >=amount){
			balance=balance-amount;
		System.out.println("Güncel bakiyeniz: "+getBalance());
		}
		else{
			System.out.println("Çekmek istediğiniz miktar bakiyenizi aşıyor.");
			
		}
	}
	
	public void deposit(double amount){
		balance +=amount;
		System.out.println("Güncel bakiyeniz: "+getBalance());
	}

	public double getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}


}
