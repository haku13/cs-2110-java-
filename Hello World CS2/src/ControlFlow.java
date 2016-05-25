//some variables, if statements, loops(while, do-while, for), new method
public class ControlFlow {

	public static void main(String[] args) {
		
		
		// sysout and control space --> System.out.println();
		//Assigning grade
		int testscore = 97;
		char grade;
		
		//if statements
		if(testscore >= 90){
			grade = 'A';			//char use '' not ""
		}
		else if(testscore >= 80) {
			grade = 'B';
		}
		else if(testscore >= 70) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		// DONT FORGET TO PRINT OUT RESULT
		System.out.println("Grade = " +grade);
		
		
		
		
		// looping - while, do-while, for, (for-each)
		int counter = 1;		
		while (counter < 11) {
			System.out.println("Count is " + counter);
			counter++;
		}
		System.out.println("Final value of count is " + counter);
		
		//do-while loop
		
		do {
			System.out.println("///////////////count is " + counter);
			counter ++;
		} while (counter < 13);		//difference: statements get executed AT LEAST ONCE
		 
		int counter2 = 12;
		do {
			System.out.println("Count 2 is " + counter2);
			counter2++;
		}while (counter2 <11);
		
		//for loop
		for (int i = 1; i < 11; i++) {
			System.out.println("count3 is " + i);
		}
	
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\nFor each example: ");
		// \n does the same thing as System.out.println("");
		for(int item : numbers) {
			// each time go through one element from the array
			System.out.println("advance count is " + item);
		}
	}
	
	
	
	//another method
	
	double currentSpeed = 5.0;
	boolean isMoving = true;
	
	public void applyBrakes() {
		if (isMoving) {
			currentSpeed--;
			//-- is subtract one -> currentSpeed = currentSpeed - 1.0;
		}
		else {
			System.out.println("The bike ain't moving right now");
		}
	}
	
}
