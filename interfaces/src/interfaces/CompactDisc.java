package interfaces;

public class CompactDisc implements RetailItem {
	private String title;
	private String artist;
	private double retailPrice;
	
	public CompactDisc(String cdTitle, String cdArtist, double cdPrice){
		title = cdTitle;
		artist = cdArtist;
		retailPrice = cdPrice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
}
