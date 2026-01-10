package library;

public class Item {
	private String title;
	private String author;
	private String typeGenre;
	private double originalPrice;
	private double borrowPrice;
	
	public Item(String title, String author, String typeGenre, double originalPrice, double borrowPrice) {
		this.title = title;
		this.author = author;
		this.typeGenre = typeGenre;
		this.originalPrice = originalPrice;
		this.borrowPrice = borrowPrice;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTypeGenre() {
		return typeGenre;
	}
	
	public double getOriginalPrice() {
		return originalPrice;
	}
	
	public double getBorrowPrice() {
		return borrowPrice;
	}

	public String toString() {
		return "Title: " + title +
				"\nAuthor: " + author +
				"\nType/Genre: " + typeGenre +
				"\nOriginal Price: $" + originalPrice +
				"\nBorrow Price: $" + borrowPrice;
	}
	
	
	public String toStringBuy() {
		return "Title: " + title +
			   "\nOrginal Price: $" + originalPrice +
			   "\n========================";
	}
	
	public String toStringBorrow() {
		return "Title: " + title +
			   "\nBorrow Price: $" + borrowPrice +
			   "\n========================";
	}
	
}

class Book extends Item {
	
	public Book(String title, String author, String typeGenre, double orginalPrice, double borrowPrice) {
		super(title, author, typeGenre, orginalPrice, borrowPrice);
	}
}

class CD extends Item {
	public CD(String title, String author, String typeGenre, double orginalPrice, double borrowPrice) {
		super(title, author, typeGenre, orginalPrice, borrowPrice);
	}
}





