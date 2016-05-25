package interfaces;

public class DvdMovies implements RetailItem{
	private String title;
	private int runningTime;
	private double retailPrice;
	
	public DvdMovies(String dvdTitle, int runTime, double dvdPrice){
		title = dvdTitle;
		runningTime = runTime;
		retailPrice = dvdPrice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	
}
