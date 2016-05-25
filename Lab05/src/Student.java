
public class Student extends Person {
	private String campusAddress;
	private double gpa = 0.0;
	
	public Student (String name, String address, String campusAddress, double gpa) {
		super (name, address);
		this.campusAddress = campusAddress;
		this.gpa = gpa;
	}
	
	public Student (String name, String address, String campusAddress) {
		super (name, address);
		this.campusAddress = campusAddress;
		this.gpa = 0.0;
	}
	
	
	public String getCampusAddress() {
		return campusAddress;
	}

	public void setCampusAddress(String campusAddress) {
		this.campusAddress = campusAddress;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString(){
		return "{Person: name=" + this.name + ", homeAddress=" + this.getAddress() + "|";
	}
}
