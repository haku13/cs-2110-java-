
public class RectangleDemo {
	private double length;
	private double width;
	
	public RectangleDemo(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public void setLength(double len) {
		if (len < 0) {
			System.out.println("no negative");
		} else {
			this.length = len;
		}
	}
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String toString() {
		return "rectangle [length: " + length + ", width:" + width + "]";
	}
	
	//equals method. content equivalent. (if length and width is equal, rectangle is equal)
	public boolean equals(RectangleDemo rec) {
		return this.length == rec.getLength() && this.width == rec.getWidth();
	}
}
