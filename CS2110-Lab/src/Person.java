import java.util.ArrayList;

public class Person {
	//fields for person, include name, id, and read
	private String name;
	private int id;
	private ArrayList<Book> read;
	
	//constructors, take name and id, initalize all fields(set read to empty)
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
		read = new ArrayList<Book>();
	}
	
	// getter for name
	public String getName() {
		return this.name;
	}
	
	// getter for ID
	public int getId() {
		return this.id;
	}
	
	// getter for read
	public ArrayList<Book> getRead() {
		return this.read;
	}
	
	// setter for name
	public void setName(String newName) {
		this.name = newName;
	}
	
	// addbook- Add book to list of the current ArrayList read if it
	// was not already in that list. Return true if the Book was added; return false if not
	public boolean addBook(Book b) {
		if (read.contains(b)) {
			System.out.println("you already read it");
			return false;
		} else {
			read.add(b);
			//System.out.println(b);
			return true;
		}
	}
	
	// has read - Return true if the current object has read the Book b. 
	//Otherwise return false
	public boolean hasRead(Book b) {
		return read.contains(b);
	}
	
	// forget- remove b from the current object's list. 
	//Return true if the Book was removed or false if it was not there
	public boolean forgetBook(Book b) {
		if (read.contains(b)) {
			read.remove(b);
			return true;
		} else {
			return false;
		}
	}
		
	//Return the number of Books the current object has read
	public int numBooksRead() {
		return read.size();
	}
	
	//return true if the current Person object's id value is equal to the id 
	//value of the Person object passed to equals(). Otherwise, return false
	public boolean equals(Object person) {	//accept all objects
		if (person instanceof Person) {		//make sure it's a person
			Person p1 = (Person) person;
			return (this.id == p1.id);		
		} else {
			return false;
		}
	}
	
	//Generate a String that shows the values of the fields name, id and read.
	public String toString() {
		return "(" + "name: " + this.name + ", id: " + this.id + ", read: " + this.read + ")";
	}
	
	//return a list of the Books that both Person a and Person b have read
	public static ArrayList<Book> commonBooks(Person a, Person b) {
		ArrayList<Book> result = new ArrayList<Book>(a.read);		//create a new arraylist that contains Person a's books
		result.retainAll(b.read);
		return result;
	}
	
	
	//Returns a measure of how similar the reading preferences of two readers are as a number
	//between 0 and 1. If either reader has not read any books, the result is 0.0. Otherwise, 
	//it is the number of commonBooks to both readers divided by smaller of the number of 
	//books a has read and the number of books b has read.
	public static double similarity(Person a, Person b) {
		ArrayList<Book> commonList = new ArrayList<Book>(Person.commonBooks(a, b));
		double numerator = commonList.size();
		if (a.numBooksRead() == 0 || b.numBooksRead() == 0) {
			return 0.0;
		} else if (a.numBooksRead() > b.numBooksRead()) {
			return numerator / b.numBooksRead();
		} else {
			return numerator / a.numBooksRead();
		}
	}
	
	
	
	//test cases
	public static void main(String[] args) {
		//all the books
		Book langYaBang = new Book("LangYaBang", "HaiYan");
		Book meiChangSu = new Book("LangYaBang", "HaiYan");
		Book onePiece = new Book("One Piece", "Eiichiro Oda");
		Book marvel = new Book("Hulk", "somebody I dont remember"); 
		
		//all the people
		Person ed = new Person("Ed", 1);
		Person al = new Person("Al", 2);
		Person fma = new Person("fma", 1);

		//test for equals - fma and ed have same ID so same person
		System.out.println("is al and ed the same person: " + al.equals(ed));		
		System.out.println("is fma and ed the same person: " + fma.equals(ed));

		//test for hasRead - has read nothing yet
		System.out.println("has ed read one piece: " + ed.hasRead(onePiece));	

		//test for toString
		System.out.println("ed info; " + ed.toString());		

		//test for forgetBook
		System.out.println(ed.addBook(onePiece));
		System.out.println("ed has forgotten book: " + ed.forgetBook(onePiece));		
		
		//al read langyabang, one piece, and marvel (since langyabang and meichangsu is the same book)
		//System.out.println("al read mei chang su: " + al.addBook(meiChangSu));		
		System.out.println("al read mei langyabang: " + al.addBook(langYaBang));
		System.out.println("al read hulk: " + al.addBook(marvel));
		System.out.println("al read one piece: " + al.addBook(onePiece));
		
		//ed read one piece, langyabang
		System.out.println("ed read one piece: " + ed.addBook(onePiece));			
		System.out.println("ed read langyabang: " + ed.addBook(langYaBang));
		System.out.println("ed read meichangsu: " + ed.addBook(meiChangSu));
		//System.out.println("ed read hulk: " + ed.addBook(marvel));
		
		//commonbooks test- both read langyabang and onepiece
		System.out.println("common books: " + Person.commonBooks(ed, al));

		//numbooks test case, al read 2
		System.out.println("numbers of books al read; " + al.numBooksRead());
		
		//similarity test case, common books=1, total#=2, -->1/2=0.5
		System.out.println("similarity between ed and al's reading list: " + Person.similarity(ed, al));
		
		//test case for hasread
		System.out.println("has ed read one piece: " + ed.hasRead(onePiece));
		
	}

}