import java.util.concurrent.ThreadLocalRandom;

public class Lab11 {
	
    private static void printNumbers(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

	
	public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
            printNumbers(array);
        }
    }

	
	
	
	public static void main(String[] args) {
		double[] list = AlgorithmLab.randomArray(2);
		double random = ThreadLocalRandom.current().nextDouble(0, 1000);
		int d = 7;
		
		/*long time = System.nanoTime();
		AlgorithmLab.mergeSort(list);
		System.out.println((System.nanoTime()-time)/1000000000.0);
		
		long time2 = System.nanoTime();
		AlgorithmLab.bubbleSort(list);
		System.out.println((System.nanoTime()-time2)/1000000000.0);	
		
		long time3 = System.nanoTime();
		AlgorithmLab.randomSort(list);
		System.out.println((System.nanoTime()-time3)/1000000000.0);	
		*/
		
		long time3 = System.nanoTime();
		AlgorithmLab.algorithm1(d);
		System.out.println((System.nanoTime()-time3)/1000000000.0);	
	
		long time4 = System.nanoTime();
		AlgorithmLab.algorithm2(d);
		System.out.println((System.nanoTime()-time4)/1000000000.0);	
		
		long time5 = System.nanoTime();
		AlgorithmLab.algorithm3(d);
		System.out.println((System.nanoTime()-time5)/1000000000.0);
		
		long time6 = System.nanoTime();
		AlgorithmLab.algorithm4(d);
		System.out.println((System.nanoTime()-time6)/1000000000.0);	
		
		long time7 = System.nanoTime();
		AlgorithmLab.algorithm5(d);
		System.out.println((System.nanoTime()-time7)/1000000000.0);	
		
		long time8 = System.nanoTime();
		AlgorithmLab.algorithm6(d);
		System.out.println((System.nanoTime()-time8)/1000000000.0);	
	
		long time9 = System.nanoTime();
		AlgorithmLab.algorithm7(d);
		System.out.println((System.nanoTime()-time9)/1000000000.0);	
	
		
	}
	
	
}
