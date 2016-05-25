package interfaces;

import java.util.ArrayList;

public class TestInterfaces {
public static void main(String[] args) {
		
		CompactDisc cd = new CompactDisc("Greatest Hits", "The Best Band Ever", 20.99);
		
		DvdMovies movie = new DvdMovies("The second best movie of all time", 120, 25.94);
		
		ArrayList<RetailItem> items = new ArrayList<RetailItem>();
		
		items.add(cd);
		items.add(movie);
		
		for(RetailItem i : items){
			System.out.println("Title: " + i.getTitle() + "\nPrice: " + i.getRetailPrice());
	//		System.out.println(i.getRunningTime());
		}

	}
}
