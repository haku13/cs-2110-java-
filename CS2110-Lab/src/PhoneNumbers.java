import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneNumbers {

	public static void main(String[] args) {
		TreeMap<String, Integer> phoneBook = new TreeMap<String, Integer>();
		phoneBook.put("a", 1234567);
		phoneBook.put("b", 2345678);
		phoneBook.put("c", 3456789);
		
		Set mySet = phoneBook.keySet(); 
		Iterator myIter = mySet.iterator();		
		
		TreeMap<Integer, String> lookUpBook = new TreeMap<Integer, String>();
		System.out.println("Beginning TreeMap output");		
		while (myIter.hasNext()) {
			String str = (String) myIter.next();
			int value = phoneBook.get(str);
			lookUpBook.put(value, str);
			
		} 	
		System.out.println("phoneBook: " + phoneBook);
		System.out.println("lookupbook: " + lookUpBook);
		
	}


}
