import java.util.Random;


public class RandomDice {
	public static void main(String trav[]){
		
	int dice = 0;
	
	//Random r = new Random();
	//dice = r.nextInt(6) + 1;
	//System.out.print(dice);
	
	Random r = new Random();
	double randomness = r.nextDouble();
	double num = randomness * 1000000;
	int ourNumber = (int)num;
	System.out.print(ourNumber);
	}

}
