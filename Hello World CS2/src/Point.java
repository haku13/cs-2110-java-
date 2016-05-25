
public class Point {
	
	// Fields/variables (at the top)
	private double x;
	private double y;

	//static variable
	static int count = 0;  //initialized to 0
	
	// Point constructor: SAME name as class
	public Point(double xVar, double yVar) {
		this.x = xVar;
		this.y = yVar;
		//xVar = this.x --- BAD IDEA!
		// x=x; -- Don't do this either!
		count = count + 1;
	}
	
	// Copy constructor (deep copy)
	// Parameter is another Point
	// p1 call the copy constructor
	// Assume p2 is already created, then you
	// Point p1 = new Point(p2); // p1's x and y coords should equal p2's
	public Point(Point myPoint) {
		this.x = myPoint.getX(); // get p2's x coordinate and assign it to p1's x
		this.y = myPoint.getY(); // get p2's y coordinate and assign it to p1's y
		//this(p2.getX(), p2.getY()); // this is another way of doing the above
	}

	/* Getter method for x */
	public double getX() {
		return x;
	}

	/* Setter method for x */
	public void setX(double x) {
		this.x = x;
	}

	/* Getter method for y */
	public double getY() {
		return y;
	}

	/* Setter method for y */
	public void setY(double y) {
		this.y = y;
	}
	
	//equals for Point [x and y to be the same]
	public boolean equals(Object o) {	//if don't use object and you compare for ex a string to int, then program will crash
		if (o instanceof Point) {		//are you a point?
			Point p2 = (Point) o;
			return (this.x == p2.x) && (this.y == p2.y);
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Point p1 = new Point(-1.0, 2.0); // Create Point p1
		System.out.println("Point p1: " + p1); // toString()

		System.out.println("The x-coord is: " + p1.getX());
		Point p2 = new Point(2.0, 2.0); // Create Point p2
		
		// Distance
		System.out.print("The distance between " + p1 + " and " + p2 + ": ");
		System.out.println(p1.distance(p2)); // distance(p1, p2);		
		
		Point p3 = new Point(4.0, 5.0);
		Point p4 = new Point(4.0, 5.0);
		
		p3.equals(p4);			//p4 was an object in the equals method
		System.out.println(p3.equals(p4));
		System.out.println(p3.equals("hi"));
	} // end main method

		
		
	/* Distance method - calculates the distance between two Points */ 
	double distance(Point  p2) {
		return Math.sqrt ( (this.x-p2.x)*(this.x-p2.x) + (this.y-p2.y)*(this.y-p2.y) );
	}
	 
	
	/* Writing our own toString() method */
	public String toString() {
		
		return "(" + this.x + "," + this.y + ")";
	}
	
}
