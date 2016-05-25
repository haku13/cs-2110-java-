//Katharine Xie(kx3jj) and Skylar Spears(srs5ab)
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class BookTest {

	@Test(timeout=100)
	public void test() {
		Person p = new Person("Alex", 14);
		Book b = new Book("some title", "some author");
		assertTrue(p.addBook(b));
		ArrayList<Book> readList = p.getRead();
		assertTrue(readList.contains(b));
	}
	
	@Test(timeout=100)
	public void twotest() {
		Person p1 = new Person("k", 13);
		Book b1 = new Book("fma", "ed");
		Book b2 = new Book("one","ONE");
		assertTrue(p1.addBook(b1));
		assertTrue(p1.addBook(b2));
		ArrayList<Book> readList1 = p1.getRead();
		assertTrue(readList1.contains(b1));
		assertTrue(readList1.contains(b2));
	}
	@Test(timeout=100)
	public void anotherTest() {
		Person p = new Person("Alex", 13);
		Book b = new Book("something", "orAnother");
		assertTrue(p.addBook(b));
		assertFalse(p.addBook(b));
		ArrayList<Book> readList = p.getRead();
		assertTrue(readList.contains(b));
	}
	
	@Test(timeout=100)
	public void forgetBookTest() {
		Person p = new Person("Darr", 13);
		Book b1 = new Book("d", "f");
		Book b2 = new Book("e", "r");
		Book b3 = new Book("h", "g");
		
		assertTrue(p.addBook(b1));
		assertTrue(p.addBook(b2));
		assertTrue(p.addBook(b3));
		
		ArrayList<Book> readList = p.getRead();
		assertTrue(readList.contains(b2));
		
		assertTrue(p.forgetBook(b2));
		assertFalse(readList.contains(b2));
	}
}
