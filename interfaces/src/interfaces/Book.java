//Katharine Xie, ID: kx3jj
package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book> {
	//fields
	private String title;			
	private String author;
	private String dueDate;
	private boolean checkedOut = false;				
	private int bookId;
	private double bookValue;
	
	//constructors
	public Book(String title, String author, int bookId, double bookValue) { 
		this.title = title;
		this.author = author;
		dueDate = new String();
		this.bookId = bookId;
		this.bookValue = bookValue;
		
	}
	
	//getters for title
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getDueDate() {
		return this.dueDate;					//newwwwwwwwwwww
	}
	
	public boolean getCheckedOut() {
		return this.checkedOut;
	}
	
	public int getBookId() {
		return this.bookId;
	}
	
	public double getBookValue() {
		return this.bookValue;
	}
	
	//setters(mutators)
	public void setDueDate(String newDueDate) {
		this.dueDate = newDueDate;
	}
	
	public void setCheckedOut(boolean checkOut) {
		this.checkedOut = checkOut;
	}
	
	public void setBookValue(double newBookId) {
		this.bookValue = newBookId;
	}
	
	
	//equals method - check if author and title match
	public boolean equals(Object book) {
		if (book instanceof Book) {		
			Book b1 = (Book) book;
			return (this.title == b1.title && this.author == b1.author && this.bookId == b1.bookId);
		} else {
			return false;
		}
	}
	
	//toString method- turn author and title value to String
	public String toString() {
		return "(" + this.title + " by " + this.author + ", book id: " + this.bookId + ", cost: " + this.bookValue + ")";
	}	
	
	

	// interface compareTo method
	@Override
	public int compareTo(Book o) {
		Book b = (Book) o;
		double priceSort = (this.bookValue - b.bookValue);
			if (this.author.compareToIgnoreCase(b.author) < 0){
				return -1;
			} else if (this.author.compareToIgnoreCase(b.author) > 0){
				return 1;
			} else {
				if (this.title.compareToIgnoreCase(b.title) < 0) {
					return -1;
				} else if (this.title.compareToIgnoreCase(b.title) > 0) {
					return 1;
				} else {
					if (priceSort > 0) {
						return 1;
				} else if (priceSort < 0){
					return -1;
				} else {
					return 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Book b1 = new Book("xxxHolic", "CLAMP", 1, 10.0);
		Book b2 = new Book("Tsubasa", "Captain", 13, 11.0);
		Book b3 = new Book("Tamen De Gushi", "Tan Jiu", 3, 4.0);
		Book b4 = new Book("Tsubasa", "CLAMP", 13, 12.0);
		Book b5 = new Book("Tamen De Gushi", "Tan Jiu", 3, 3.0);
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		
		System.out.println("before sorting: " + bookList);
		
		System.out.println(b2.compareTo(b4));
		
		List<Book> list = new ArrayList<Book>(bookList);
		
		System.out.println();
		Collections.sort(list);
		System.out.println("after sorting: " + list);
		
	}

	
		
		
		
		
}