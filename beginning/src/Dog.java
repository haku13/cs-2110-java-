
public class Dog extends Animal{
//class, subclass, extends to superclass
	
	@Override
	void isItOnEarth() {
		// TODO Auto-generated method stub
		super.isItOnEarth();
	}
		//use superclass "Animal" and use its isitonearth method
	
	String name;
	String breed;
	
	Dog(){
		
	}
	
	Dog(String n, String b){
		name = n;
		breed = b;
		
	}
	
	void printName(){
		System.out.println(name);
	}
	void printBreed(){
		System.out.println(breed);
	}
	
	void bark(){
		System.out.print("woof ");
	
	}
	void dig(){
		System.out.print("fuck yes digging");
	}
}
