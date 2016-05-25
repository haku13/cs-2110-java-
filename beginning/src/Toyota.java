
public class Toyota extends CarAbstract{
	
	public Toyota() {
		// TODO Auto-generated constructor stub
	
			double mpg = mpg(63, 2);
			
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.print("i'm toyota");
	}

	@Override
	public void setupComputer() {
		// TODO Auto-generated method stub
		System.out.print("computer set up!");
		
	}

	@Override
	public void tireSize(int year, String model) {
		// TODO Auto-generated method stub
		System.out.print("for the model " + model + " you need small tires");
	}
}
