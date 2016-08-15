package tr.org.linux.kamp2016.bookproject;



public class ShoppingCart {
	Book[] bookArray = new Book[10];
	int field;
	int numEntriesInCart;
	int copyNumEntriesInCart;
	
	public Book[] getBookArray() {
		return bookArray;
	}
	public void setBookArray(Book[] bookArray) {
		this.bookArray = bookArray;
	}
	public int getField() {
		return field;
	}
	public void setField(int field) {
		this.field = field;
	}
	public int getNumEntriesInCart() {
		return numEntriesInCart;
	}
	public void setNumEntriesInCart(int numEntriesInCart) {
		if(this.numEntriesInCart<=10){
		this.numEntriesInCart = numEntriesInCart;}
	}
	
	public boolean addBook(Book book){
		
		copyNumEntriesInCart=numEntriesInCart;
		if(numEntriesInCart<10)
		{
			for(int i=numEntriesInCart;i<=10;i++){
				bookArray[i]=book;
				numEntriesInCart++;
			}
		}
		if(numEntriesInCart>copyNumEntriesInCart)
			return true;
		else
		return false;
	}
	public boolean removeLastBook(){
		boolean result=false;
		if(bookArray.length>0){
			bookArray[bookArray.length-1]=null;
			result=true;
			numEntriesInCart--;
		}
		return result;
	}
	@Override
	public String toString() {
		/****/
	}
	
	
	
}
