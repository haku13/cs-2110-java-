import java.util.Random;
public class ArrayandForLoop {
	public static void main(String trav[]){
		
		Random r = new Random();
		
		int[] num = new int[1];
		//System.out.print(num.length);		//check length of array
		
		boolean gameResult = true;
		
		
		for(int i = 0; i < num.length; i++){	
			num[i] = r.nextInt(100) + 1;
			if (num[i] % 2 == 0){
				System.out.println("TRUE - " + num[i] + " is divisible by 2");
			}else{
				System.out.println("FALSE - "+ num[i] + " is not divisible by 2");
				gameResult = false;
			}
			
		}
		
		if (gameResult){
			System.out.println("YOU'VE WON");
		}else{
			System.out.println("YOU LOSE");
		}
	}

}
