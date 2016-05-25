import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//calculate pi to the nth digit (enter n)

public class Question1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of digits:");
        
        try {
        	int n = Integer.parseInt(br.readLine());
        	Double pi = 0d;
        	boolean plus = true;
        	int divisor = 1;
        	
        	int iterarions = 100000;
        	
        	for (int i = 0; i < iterarions; i++) {
        		if (!plus) {
        			pi -= (1d / divisor);
        		} else {
        			pi += (1d / divisor);
        		}
        		plus = !plus;
        		divisor += 2;
			}
        	
        	pi = pi * 4;
        	
        	char[] outputChars = pi.toString().toCharArray();
        	String output = "3.";
        	
        	for (int i = 2; i < n+2; i++) {
        		output += outputChars[i];
			}
        	
        	System.out.println(output);
        } catch(NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        }
	}
	
}
