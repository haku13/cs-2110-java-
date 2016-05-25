import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//calculate date and time
public class Question2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the year:");
        try{
            int y = Integer.parseInt(br.readLine());
            int a = y % 19;
            int b = y / 100;
            int c = y % 100;
            int d = b / 4;
            int e = b % 4;
            int g = (8 * b + 13) / 25;
            int h = (19 * a + b - d - g + 15) % 30;
            int j = c / 4;
            int k = c % 4;
            int m = (a + 11 * h) / 319;
            int r = (2 * e + 2 * j - k - h + m + 32) % 7;
            int n = (h - m + r + 90) / 25;
            int p = (h - m + r + n + 19) % 32;
            
            System.out.println("Month: " + n);
            System.out.println("Day: " + p);
        } catch(NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        }
	}

}
