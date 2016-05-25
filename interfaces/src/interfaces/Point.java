package interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Point implements Comparable<Point> {

	double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	@Override
	public int compareTo(Point p1) {
		double dx = x - p1.x;
		double dy = y - p1.y;
		if (dx < 0) {
			return -1;
		} else if (dx > 0) {
			return 1;
		} else {
			if (dy < 0) {
				return -1;

			} else if (dy > 0) {
				return 1;

			}else{
				return 0;
			}

		}
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public static void main(String[] args) {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(Math.cos(Math.PI / 4), Math.sin(Math.PI / 4));
		Point p3 = new Point(0, .2);
		Point p4 = new Point(-1,0);
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		// The original list in the order the points where added
		System.out.println("The list to start with: " + list);

		// The list after sorting according to magnitude.
		// Note that if two points are considered "equal" by the compare method
		// the relative
		// order of the objects doesn't change.
		// That is point p1 still appears before point p2 since they have the
		// same magnitude
		
		//System.out.println(p1.compareTo(p2));
		
		//Collections.sort(list, new CmpPointByMag());
		//System.out.println("The List after it has been sorted according to magnitude " + list);

		// The list after sorting according to the compareTo method above.
		// That is sorting by x values and then y values.
		Collections.sort(list);
		System.out.println("The list after it has been sorted according" + "to the compareTo method" + list);

	}

}