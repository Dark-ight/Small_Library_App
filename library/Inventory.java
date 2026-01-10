package library;

import java.util.ArrayList;

public class Inventory{
	private ArrayList<Book> books;
	private ArrayList<CD> cds;
	
	
	public Inventory() {
		books = new ArrayList<>();
		cds = new ArrayList<>();
		initializeInventory();
	}
	
	
	private void initializeInventory() {
		books.add(new Book("1984", "George Orwell", "Dystopian", 15.99, 3.99));
		books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 14.50, 3.50));
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 13.99, 3.25));
		
		books.add(new Book("Moby Dick", "Herman Melville", "Adventure", 18.00, 4.50));
		books.add(new Book("Pride and Prejudice", "Jane Austen", "Romance", 12.99, 2.99));
		books.add(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 16.99, 4.25));
		
		books.add(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 19.99, 4.99));
		books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "Classic", 14.99, 3.75));
		books.add(new Book("Fahrenheit 451", "Ray Bradbury", "Sci-Fi", 15.50, 3.60));
		
		books.add(new Book("Brave New World", "Aldous Huxley", "Sci-Fi", 16.00, 3.90));
		books.add(new Book("The Alchemist", "Paulo Coelho", "Philosophy", 13.50, 3.20));
		books.add(new Book("The Da Vinci Code", "Dan Brown", "Mystery", 17.99, 4.10));
		
		books.add(new Book("The Hunger Games", "Suzanne Collins", "Action", 18.99, 4.75));
		books.add(new Book("The Shining", "Stephen King", "Horror", 16.75, 4.00));
		books.add(new Book("Dracula", "Bram Stoker", "Horror", 14.25, 3.30));
		
		books.add(new Book("Dune", "Frank Herbert", "Sci-Fi", 20.99, 5.25));
		books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 24.99, 6.50));
		books.add(new Book("Animal Farm", "George Orwell", "Dystopian", 12.50, 3.10));
		
		books.add(new Book("The Chronicles of Narnia", "C.S. Lewis", "Fantasy", 21.99, 5.75));
		books.add(new Book("Sherlock Holmes", "Arthur Conan Doyle", "Mystery", 15.99, 3.85));

		
		cds.add(new CD("Thriller", "Michael Jackson", "Pop", 18.99, 4.50));
		cds.add(new CD("Back in Black", "AC/DC", "Rock", 17.99, 4.25));
		cds.add(new CD("The Dark Side of the Moon", "Pink Floyd", "Rock", 19.99, 4.75));
		cds.add(new CD("Rumours", "Fleetwood Mac", "Rock", 16.99, 4.10));
		cds.add(new CD("Abbey Road", "The Beatles", "Rock", 20.50, 4.90));
		cds.add(new CD("25", "Adele", "Pop", 15.99, 3.80));
		cds.add(new CD("1989", "Taylor Swift", "Pop", 16.50, 3.95));
		cds.add(new CD("DAMN.", "Kendrick Lamar", "Hip-Hop", 17.75, 4.20));
		cds.add(new CD("The Eminem Show", "Eminem", "Hip-Hop", 18.25, 4.60));
		cds.add(new CD("Graduation", "Kanye West", "Hip-Hop", 17.99, 4.30));
		cds.add(new CD("Nevermind", "Nirvana", "Grunge", 16.99, 4.00));
		cds.add(new CD("Hotel California", "Eagles", "Rock", 18.50, 4.40));
		cds.add(new CD("Born to Die", "Lana Del Rey", "Indie", 15.75, 3.70));
		cds.add(new CD("Random Access Memories", "Daft Punk", "Electronic", 19.25, 4.80));
		cds.add(new CD("After Hours", "The Weeknd", "R&B", 18.00, 4.35));

	}
	
	public Book getBook(int index) {
		return books.get(index);
	}
	
	public CD getCD(int index) {
		return cds.get(index);
	}
	
	public int getLengthBook() {
		return books.size();
	}
	
	public void printAllBooks() {
		for(int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}
	
	public void printAllCDs() {
		for(int i = 0; i < cds.size(); i++) {
			System.out.println(cds.get(i).toString());
		}
	}
	
	
	
}
