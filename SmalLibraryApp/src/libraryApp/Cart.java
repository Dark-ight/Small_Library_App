package libraryApp;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Book> books;
	private ArrayList<CD> cds;
	private ArrayList<Book> borrowBooks;
	private ArrayList<CD> borrowCDs;
	private ArrayList<Book> buyBooks;
	private ArrayList<CD> buyCDs;
	
		
	public Cart() {
		books = new ArrayList<>();
		cds = new ArrayList<>();
		borrowBooks = new ArrayList<>();
		borrowCDs = new ArrayList<>();
		buyBooks = new ArrayList<>();
		buyCDs = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void addCD(CD cd) {
		cds.add(cd);
	}
	
	// Get a specific of buy/borrow of Book/CD in that array ==================================================================
	public Book getBuyBook(int index) {
		return buyBooks.get(index);
	}
	
	public Book getBorrowBook(int index) {
		return borrowBooks.get(index);
	}
	
	public CD getBuyCD(int index) {
		return buyCDs.get(index);
	}
	
	public CD getBorrowCD(int index) {
		return borrowCDs.get(index);
	}
	
	// Add a buy/borrow of Book/CD in that array ====================================================================
	public void addBuyBook(Book book) {
		buyBooks.add(book);
	}
	
	public void addBorrowedBook(Book book) {
		borrowBooks.add(book);
	}
	
	public void addBuyCD(CD cd) {
		buyCDs.add(cd);
	}
	
	public void addBorrowedCD(CD cd) {
		borrowCDs.add(cd);
	}
	
	// Delete a buy/borrow of Book/CD in that array ====================================================================
	
	
	public void deleteBuyBook(int index) {
		buyBooks.remove(index);
	}
	
	public void deleteBorrowBook(int index) {
		borrowBooks.remove(index);
	}
	
	public void deleteBuyCD(int index) {
		buyCDs.remove(index);
	}
	
	public void deleteBorrowCD(int index) {
		borrowCDs.remove(index);
	}
	
	// Print all book =============================================================
	
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
	
	//Return all Buy/Borrow of Books and CDs ====================================================================

	
	public void printAllBorrowBooks() {
		for(int i = 0; i < borrowBooks.size(); i++) {
			System.out.println(borrowBooks.get(i).toString());
		}
	}
	
	public void printAllBuyBooks() {
		for(int i = 0; i < buyBooks.size(); i++) {
			System.out.println(buyBooks.get(i).toString());
		}
	}
	
	public void printAllBorrowCDs() {
		for(int i = 0; i < borrowCDs.size(); i++) {
			System.out.println(borrowCDs.get(i).toString());
		}
	}
	
	public void printAllBuyCDs() {
		for(int i = 0; i < buyCDs.size(); i++) {
			System.out.println(buyCDs.get(i).toString());
		}
	}
	
	
	//Return all Books and CDs 's title and buy/borrow price ====================================================================

	public String printAllProcessBuyBooks() {
		String s = "";
		
		for(int i = 0; i < buyBooks.size(); i++) {
			s = s + "\n" + buyBooks.get(i).toStringBuy();
		}
		return s;
	}
	
	public String printAllProcessBorrowBooks() {
		String s = "";
		
		for(int i = 0; i < borrowBooks.size(); i++) {
			s = s + "\n" + borrowBooks.get(i).toStringBorrow();
		}
		return s;
	}
	
	public String printAllProcessBuyCDs() {
		String s = "";
		
		for(int i = 0; i < buyCDs.size(); i++) {
			s = s + "\n" + buyCDs.get(i).toStringBuy();
		}
		return s;
	}
	
	public String printAllProcessBorrowCDs() {
		String s = "";
		
		for(int i = 0; i < borrowCDs.size(); i++) {
			s = s + "\n" + borrowCDs.get(i).toStringBorrow();
		}
		return s;
	}
	
	
	
	//Return total of Books and CDs ====================================================================
	
	public String returnTotalBuyBooks() {
		String s = Integer.toString(buyBooks.size());
		return s;
	}
	
	public String returnTotalBorrowBooks() {
		String s = Integer.toString(borrowBooks.size());
		return s;
	}
	
	public String returnTotalBuyCDs() {
		String s = Integer.toString(buyCDs.size());
		return s;
	}
	
	public String returnTotalBorrowCDs() {
		String s = Integer.toString(borrowCDs.size());
		return s;
	}
	
	public String returnAll() {
		int count = 0;
		count = buyBooks.size() + borrowBooks.size() + buyCDs.size() + borrowCDs.size();
		return Integer.toString(count);
	}
	
	
	//Calculate everything
	
	public double calculateSum() {
		double total = 0;
		
		for (int i = 0; i < buyBooks.size(); i++) {
			total = total + buyBooks.get(i).getOriginalPrice();
		}
		
		for (int i = 0; i < borrowBooks.size(); i++) {
			total = total + borrowBooks.get(i).getBorrowPrice();
		}
		
		for (int i = 0; i < buyCDs.size(); i++) {
			total = total + buyCDs.get(i).getOriginalPrice();
		}
		
		for (int i = 0; i < borrowCDs.size(); i++) {
			total = total + borrowCDs.get(i).getBorrowPrice();
		}
		
		return total;
	}
	
	
	public void deteleAll() {
		buyBooks.clear();
		borrowBooks.clear();
		buyCDs.clear();
		borrowCDs.clear();
	}
	
	
	
	
	public String printReceipt(double money, String name) {
		return "===========Information===========" +
			 "\nUsername:__________________________" + name +
			 "\nCredits:__________________________ $" + money +
			 "\n===========Summary===========" +
			 "\nTotal Sum of buy Books:_____________$" + Double.toString(Math.round(calculateBuyBookSum() * 100.0) / 100.0) +
			 "\nItem:________________________________" + returnTotalBuyBooks() + " Books" + 
			 "\nTotal Sum of borrow Books:___________$" + Double.toString(Math.round(calculateBorrowBookSum() * 100.0) / 100.0) +
			 "\nItem:________________________________" + returnTotalBorrowBooks() + " Books" + 
			 "\nTotal Sum of buy CDs:_____________$" + Double.toString(Math.round(calculateBuyCDsSum() * 100.0) / 100.0) +
			 "\nItem:__________________________________" + returnTotalBuyCDs() + " CDs" + 
			 "\nTotal Sum of borrow CDs:_____________$" + Double.toString(Math.round(calculateBorrowCDsSum() * 100.0) / 100.0) +
			 "\nItem:__________________________________" + returnTotalBorrowCDs() + " CDs" + 
			 "\nTotal Items:____________________________" + returnAll() + 
			 "\nSum:_______________________________$" + Double.toString(Math.round(calculateSum() * 100.0) / 100.0) +
			 "\n=============Tax=============" +
			 "\nTax:___________________________________10%" + 
			 "\nWith Tax:__________________________$" + Double.toString(Math.round(((calculateSum() * 100.0) / 100.0) + (((calculateSum() * 100.0) / 100.0) * 0.1)))  +
			 "\n=============================" +
			 "\n___________________________________$" + money +
			 "\n_______________________________________-$" + Double.toString(Math.round(((calculateSum() * 100.0) / 100.0) + (((calculateSum() * 100.0) / 100.0) * 0.1))) +
			 "\n_________________________________=$" + Double.toString(Math.round(money - ((calculateSum() * 100.0) / 100.0) + (((calculateSum() * 100.0) / 100.0) * 0.1))) +
			 "\n=============End=============" +
			 "\n__________Thank you for shopping__________" +
			 "\n=============================";
	}
	
	public double calculateBuyBookSum() {
		double total = 0;
		for (int i = 0; i < buyBooks.size(); i++) {
			total = total + buyBooks.get(i).getOriginalPrice();
		}
		
		return total;
	}
	
	public double calculateBorrowBookSum() {
		double total = 0;
		for (int i = 0; i < borrowBooks.size(); i++) {
			total = total + borrowBooks.get(i).getBorrowPrice();
		}
		
		return total;
	}
	
	public double calculateBuyCDsSum() {
		double total = 0;
		for (int i = 0; i < buyCDs.size(); i++) {
			total = total + buyCDs.get(i).getOriginalPrice();
		}
		
		return total;
	}
	
	public double calculateBorrowCDsSum() {
		double total = 0;
		for (int i = 0; i < borrowCDs.size(); i++) {
			total = total + borrowCDs.get(i).getBorrowPrice();
		}
		
		return total;
	}
	
}
