import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DistinctWords {

	public static void main(String[] args) {
		String str[] = {"wasdfi", "what", "eeg", "eeg"};
		System.out.println("size is " + str.length);
		
		Set<String> s = new HashSet<String>();
		
		for (int i = 0; i < str.length; i++) {
			s.add(str[1]);
		}
		
		System.out.println("size is " + s.size());
		System.out.println(s);
		
		Set<String> treeSet = new TreeSet<String>();
		for (int i = 0; i < str.length; i++) {
			treeSet.add(str[i]);
			
		}
		
		System.out.println("size is : " + treeSet.size());
		System.out.println(treeSet);
		
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		
		for (int i = 0; i < str.length; i++ ) {
			if (!uniques.add(str[i])) {
				dups.add(str[i]);
			}
		}
		System.out.println(uniques);
		uniques.removeAll(dups);		//remove all duplicates in uniques
		
		System.out.println(uniques);
		System.out.println(dups);
	}
}
