
public class Book {
	//fields
	private String title;			
	private String author;
	
	//constructors
	public Book(String title, String author) { 
		this.title = title;
		this.author = author;
	}
	
	//getters for title
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	//equals method - check if author and title match
	public boolean equals(Object book) {
		if (book instanceof Book) {		//are you a point?
			Book b1 = (Book) book;
			return (this.title == b1.title) && (this.author == b1.author);
		} else {
			return false;
		}
	}
	
	//toString method- turn author and title value to String
	public String toString() {
		return "title; " + this.title + ", author: " + this.author;
	}
	
	//test cases
	public static void main(String[] args) {
		Book langYaBang = new Book("LangYaBang", "HaiYan");
		Book meiChangSu = new Book("LangYaBang", "HaiYan");
		Book onePiece = new Book("One Piece", "Eiichiro Oda");
		
		//equals test- langyabang and mechangsu is the same, one piece and langyabang is not
		System.out.println("one piece and langyabang is same book: " + onePiece.equals(langYaBang));
		System.out.println("langyabang and meichangsu? " + meiChangSu.equals(langYaBang));
		
		//test for toString-author is haiyan, title langyabang
		System.out.println(langYaBang.toString());
	}
}
	
