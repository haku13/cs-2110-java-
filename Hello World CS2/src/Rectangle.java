
public class Rectangle {

	public static void main(String[] args) {
		//an instance of RectangleDemo?
		RectangleDemo reck = new RectangleDemo(3, 6);
		reck.setLength(5);
		System.out.println(reck.getLength());
		System.out.println(reck.toString());
		//or System.out.println(reck);   

		RectangleDemo newRec = new RectangleDemo(3, 6);
		
		if(newRec == reck) {
			System.out.println("what?");
		} else if(newRec.equals(reck)) {
			System.out.println("should happen");
		} else{
			System.out.println("shouldn't happen");
		}
	}

}
