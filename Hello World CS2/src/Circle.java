

public class Circle {
	
	private Point center;
	private double radius;
	
	/* Circle Constructor */
	public Circle(Point c, double rad) {
		this.center = c;
		this.radius = rad;
	}

	public static void main(String[] args) {
		Point p1 = new Point(0.0, 0.0);
		// Circle: center point, radius
		Circle c1 = new Circle(p1, 1.5); // Notice: using Point p1!
		System.out.println("My circle is: " + c1);
		System.out.println("");
		System.out.println("c1.center is: " + c1.center);
		//System.out.println(c1.center.x); // Won't work! "Point.x not visible"
		System.out.println("x: " + c1.center.getX()); // this will work using getX()
		
		System.out.println("");
		Point p2 = new Point(0.0, 1.5); // Create another point...
		
		boolean result = c1.encloses(p2); // boolean return
		System.out.println("Is Point p2 " + p2 + " enclosed in c1? " + result);

	}
	
	/* This method calculates if a point is enclosed in a circle
	 * If a point is inside the circle or on the circumference it is "enclosed"
	 * Strategy: if the distance between the center of the circle and the
	 *  point-in-question is less than or equal to the radius, then the method
	 *  will return "true" (point is enclosed), else it will return "false" 
	 */
	private boolean encloses (Point p) {
		double dist = p.distance(this.center); // using Point's distance method
		return (dist <= radius); // is distance <= radius?
	}
	
	@Override
	public String toString() {
		System.out.println("Hi from Circle toString!!!");
		return "<" + this.center + "," + this.radius + ">";
		// Notice the output when printing a circle!
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}