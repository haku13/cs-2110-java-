import java.util.Scanner;


public class Action {

	public static void main(String trav[]) {
	
		Dog Co;
		Co = new Dog();
		
		int start = 0;
		Scanner InputFromUser = new Scanner(System.in); 
		int finish = InputFromUser.nextInt();
		
		Scanner InputWords = new Scanner(System.in); 
		String words = InputWords.nextLine();
		
		while(start < finish) {
			Co.bark();
			System.out.print(words);
			start += 1;
		}
		
		Co.dig();
	}

}
