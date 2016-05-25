import java.util.Random;

public class SwitchandCase {
	public static void main(String trav[]){
		
		int gun = 0;
		Random r = new Random();
		gun = r.nextInt(6);
		
		switch (gun){
		
		case 0:
			System.out.print("you're safe");
			break;
		case 1:
			System.out.print("you got caught in a bear trap");
			break;
		case 2:
			System.out.print("you're lost");
			break;
		case 3:
			System.out.print("you're dead");
			break;
		case 4:
			System.out.print("you're partner got eaten by a giant man eating plant");
			break;
		case 5:
			System.out.print("you lost an eye");
			break;
		}
	}
}
