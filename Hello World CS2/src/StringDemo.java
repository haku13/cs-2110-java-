
public class StringDemo {

	public static void main(String[] args) {
		String greeting = "Hello, ";
		String message = "I'm here to ruin your life...";

		int stringSize = message.length();		//find length of main
		System.out.println(stringSize);
		
		String message2 = "HAHAHAHAHA";
		String lower = message2.toLowerCase();
		String upper = message2.toUpperCase();
		
		System.out.println(greeting + message + lower + upper);

	}

}
