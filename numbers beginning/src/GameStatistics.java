import java.util.Random;


public class GameStatistics {
	public static void main(String trav[]){
		
		double numOfGames = 10000;
		int arrayNum = 10;
		Random r = new Random();
		int[] num = new int[arrayNum]; //same as "- {0,0,0,0,0}		//System.out.print(num.length);		//check length of array
		boolean gameResult = true;
		boolean[] odds = new boolean[(int) numOfGames];
		int a = 0;
		double numOfWins = 0;
		
		
		while (a < numOfGames) {
		
			for(int i = 0; i < num.length; i++){	
				num[i] = r.nextInt(100) + 1;
				if (num[i] % 2 == 0){
				}else{
					gameResult = false;
				}
			}
		
			if (gameResult){
				odds[a] = true;
			}
			gameResult = true;
			a++;
			}
			
			for(int i = 0; i < odds.length; i++){
				if (odds[i]){
					numOfWins++;
				}
			}
			double percentWin = (numOfWins / numOfGames)*100;
			System.out.print(percentWin + "% of an array with "
					+ arrayNum + " positions");
		}
	
	}


