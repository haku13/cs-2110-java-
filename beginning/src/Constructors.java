
public class Constructors {
	public static void main(String trav[]){
		
		
		Dog Co = new Dog("Co", "Golden Retriever");
		Dog henry = new Dog("Henry", "Pitbull");
		
		Co.printName();
		Co.printBreed();
		henry.printName();
		henry.printBreed();
		
		Co.isItOnEarth();
	}
	
}
