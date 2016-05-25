
public class CarObject {
	public static void main(String []args){
		
		Toyota t = new Toyota();
		//t.tireSize(2008, "Beetle");
		t.speak();
		
		CarAbstract c1, c2, c3;
		c1 = new Toyota();		//polymorphism - create new toyota even though c1 is a car
		c2 = new Honda();
		c3 = new Ford();
		
		//c1.speak();
		//c2.speak();
		//c3.speak();
		test(t); 
	}

	private static void test(CarAbstract x) {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

}
