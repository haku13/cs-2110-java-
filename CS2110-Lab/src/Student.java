//Katharine Xie(kx3jj), Skylar Spears(srs5sb)
import java.util.ArrayList;

public class Student {
	private String name;
	private double gpa;
	private ArrayList<Course> courses;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		courses = new ArrayList<Course>(); 
	}
	
	public Student(String name) {
		this.name = name;
		this.gpa = 0.0;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
 
	public boolean add(Course aCourse) {
		boolean result = false;
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i) == aCourse) {
				result = false;
			} else {
				courses.add(aCourse);
				result = true;
			}
		}
		return result;
	}
	
	public boolean drop(Course aCourse) {
		boolean result = false;
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i) == aCourse) {
				courses.remove(aCourse);
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}
	
	public void dropAll() {
		courses.clear();
	}
	
	public String toString() {
		return "name: " + this.name + ", gpa: " + this.gpa + ", courses: " + this.courses;
	}
	
	public boolean equals(Object s2) {
		boolean result = false;
		if (s2 instanceof Student) {
			Student s1 = (Student)s2;
			
			result = s1.equals(this.name);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Student david = new Student("david", 222.0);
		Course math = new Course("math", "1849");
		Course eng = new Course("english", "33");
		
		ArrayList<Course> davidCourse = new ArrayList<Course>();
		davidCourse.add(math);
		System.out.println(david.getCourses());
		//david.add(eng);
		System.out.println(davidCourse);
		System.out.println(david.toString());
		
		
	}
}
