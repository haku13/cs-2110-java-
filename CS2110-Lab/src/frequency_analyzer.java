import java.io.File;
import java.util.Scanner;

public class frequency_analyzer {

	public static void main(String[] args) {
		System.out.println("working directory = " + System.getProperty("user.dir"));


		try {
			File file = new File("text1.txt");
			Scanner inputFile = new Scanner("text1.txt");	
        } catch (Exception e) {
        	System.out.println("file could not be found");
        }
		
		char[] arrCharacter;
		arrCharacter = new char[26];
		
		int[] arrCount;
		arrCount = new int[26];
		for (int i = 0; i < arrCharacter.length; i++){
		//	if(!arrCharacter.Contains(input[index]))
			//	arrCharacter.Add(input[index]);
		}
		
		
	}

}
