package tr.org.linux.kamp2016.bookproject;

public class Book {
	String name;
	String author;
	double price;
	String bookId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			price = 0;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		if (bookId.length() == 10)
			this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String name, String author, double price, String bookId) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.bookId = bookId;
	}

	public void applyDiscount(double discountPercentage) {
		price = price - ((price * discountPercentage) / 100);
	}

	@Override
	public String toString() {
		return "Book name=" + name + ", author=" + author + ", price=" + price
				+ ", bookId=" + bookId;
	}

}
