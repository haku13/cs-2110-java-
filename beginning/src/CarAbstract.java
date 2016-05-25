
public abstract class CarAbstract {
	public CarAbstract() {
		// TODO Auto-generated constructor stub
		//System.out.print("cars!!");
}

	public double mpg(double miles, double gallons){
		return (miles/gallons);			//method can be used by all cars
	}
	
	public abstract void setupComputer();
	
	public abstract void tireSize(int year, String model);
		
	public void speak(){
		System.out.print("I'm a car");
		
	}
}

