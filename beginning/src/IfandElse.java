import java.util.Scanner;


public class IfandElse {
	public static void main(String trav[]) {
		int start = 0;
		System.out.println("Enter an Integer: ");
		Scanner InputFromUser = new Scanner(System.in);
		int finish;
		if (InputFromUser.hasNextInt()){
			finish = InputFromUser.nextInt();
			System.out.println("Enter a String");
		}else{
			finish = 1;
			System.out.println("Play by the rules. Enter an String");
		}
		
		Scanner InputWords = new Scanner(System.in);
		String words = InputWords.nextLine();
		
		while (start < finish) {
			System.out.println(words);;
			start += 1;
		}
		
		System.out.print("boolean is for true and false, hasNextInt checks for integar.");
	}
}
