import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
public class Lab1Scanner {

	public static void main(String[] args) {
//		double y = 0.0;
//		Scanner stdin = new Scanner (System.in);
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Enter a number: ");
//			double x = stdin.nextInt();
//			y = x + y;
//			
//		}
//		double average = y/5;
//		System.out.println("the average is " + average);
//		// TA told me I could just write the average is ___ ?
		
		try {
            File file = new File("data1.txt");
            System.out.println(file.length());
            System.out.println(file.getAbsolutePath());
        } catch (Exception e) {
        }
		
	}

}
