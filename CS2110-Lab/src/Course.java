//Katharine Xie(kx3jj), Skylar Spears(srs5sb)
import java.util.ArrayList;

public class Course {
	private String id;
	private String name;
	private ArrayList<Student> roll;
	
	public Course(String name, String id) {
		this.id = id;
		this.name = name;
		if (name == null || id == null) {
			throw new IllegalArgumentException("name or id cant null");
		}
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Student> getRoll() {
		return roll;
	}
	
	public boolean add(Student aStudent) {
		boolean result = false;
		for (int i = 0; i < roll.size(); i++) {
			if (roll.get(i) == aStudent) {
				result = false;
			} else {
				roll.add(aStudent);
				result = true;
			}
		}
		return result;
	}
	
	public boolean drop(Student aStudent) {
		boolean result = false;
		for (int i = 0; i < roll.size(); i++) {
			if (roll.get(i) == aStudent) {
				roll.remove(aStudent);
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}
	
	public void cancel() {
		roll.clear();
	}
	
	public double averageGPA() {
		double allGPA = 0.0;
		double result = 0.0;
		for (int i = 0; i < roll.size(); i++) {
			if (roll.size() == 0) {
				result = -1.0; 
			} else {
				Student student = roll.get(i);
				double gpa = student.getGpa();
				allGPA = allGPA + gpa;		
				result = allGPA / roll.size();
			}
		}
		return result;
	}
	
	public String toString() {
		return "course id: " + this.id + ", course name: " + this.name + ", enrolled student: " + this.roll;
	}
	
	public static void main(String[] args) {
		Course math = new Course("math", "1849");
		Student david = new Student("david", 222.0);
		ArrayList<Student> mathRoll = new ArrayList<Student>();
		mathRoll.add(david);
		
		System.out.println(mathRoll.toString());
		System.out.println(math);
	}

}

