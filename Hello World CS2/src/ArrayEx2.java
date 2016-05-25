import java.util.Arrays; // used for Arrays.fill() method demo
public class ArrayEx2 {


	public static void main(String[] args) {
		int[] myNumArr = {2, 4, 6, 8};
		int[] reversedArr = new int[myNumArr.length];
		System.out.println("Size of newly created reversedArr: " + myNumArr.length);
		reversedArr = reverse(myNumArr); // call the reverse method, with myNumArr as param
		// ---------------------------------------
		// PRINTING ORIGINAL ARRAY:
		System.out.print("Original Array:  ");
		for(int i = 0; i < myNumArr.length; i++) { // print the array
			System.out.print(myNumArr[i]); // print the ith element 
		}		
		System.out.println("");
		
		// PRINTING RESULTING ARRAY:
		System.out.print("Reversed Array:  ");		
		for(int i = 0; i < reversedArr.length; i++) { // print the array
			System.out.print(reversedArr[i]); // print the ith element 
		}
		// ---------------------------------------		
		// PRINTING A PARTICULAR ELEMENT
		System.out.println("\nEle at index 1 (2nd position) of reversed array: " + reversedArr[1]);
		
		// ---------------------------------------
		// ---------------------------------------		
		
		// DEMO of java.util.Arrays.fill(int[] a, int val) method. Assigns the 
		// specified int value to each element of the specified array of ints
		
		// NEED:  import java.util.Arrays; 
		
		// The Arrays Class provides various methods to perform useful operations
		// one of them is the fill method.
		int[] myFillArr = new int[5];
		
		// using fill for placing 18
		Arrays.fill(myFillArr, 18);

		// let us print the values
		System.out.println("\nNew values after using fill() method: ");
		for (int value : myFillArr) { // for-each loop
		   System.out.println("Value = " + value);
		}		
		
		// ---------------------------------------	
		// Equality?
		// DEMO of java.util.Arrays.equals(int[] a1, int[] a2) method
		
		int[] arr1 = new int[5];		// {7, 7, 7, 7, 7}
		int[] arr2 = new int[5];		// {7, 7, 7, 7, 7}
		int[] arr3 = {1, 2, 3, 4, 5};	// {1, 2, 3, 4, 5}
		
		// using fill for placing 7
		Arrays.fill(arr1, 7);
		Arrays.fill(arr2, 7);
		
		System.out.println(arr1 == arr2);   //false
		System.out.println(arr1.equals(arr2));   //false
		
		System.out.println(arr1.equals(arr1));  //5000 = 5000?
		System.out.println(arr1 == arr1);
		
		//Arrays.equals(arr1,arr2)- comparing CONTENT of the arrays
		System.out.println("Arrays.equals(arr1,arr2)? " + Arrays.equals(arr1,  arr2) );
		
		// array1.equals(array2) is the same as array1 == array2
		// i.e. is it the same array (memory location) - doesn't look at content
		System.out.print("\narr1 == arr2? ");
		System.out.println(arr1 == arr2);			// false!
		System.out.print("arr1.equals(arr2)? ");
		System.out.println(arr1.equals(arr2));		// false!
		System.out.print("arr1.equals(arr1)? ");
		System.out.println(arr1.equals(arr1));		// true!
		
		//Arrays.equals(array1, array2) compares the contents of the arrays
		//    - both arrays contain the same number of elements, AND
		//    - all corresponding pairs of elements in the 2 arrays are equal
		System.out.print("Arrays.equals(arr1, arr2)? ");
		System.out.println(Arrays.equals(arr1, arr2));		// true!
		System.out.print("Arrays.equals(arr1, arr3)? ");
		System.out.println(Arrays.equals(arr1, arr3));		// false!		
		
		// ---------------------------------------	
		
	} // end MAIN method

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length]; // int array same size as list
		
		for (int i = 0, j = result.length - 1; i<list.length; i++, j--) {
			// lcv i is set at 0: beginning of list
			// lcv j is set to last index of result
			// lcv i increments by one after each iteration
			// lcv j decrements by one after each iteration
			result[j] = list[i]; // result gets values in list reversed
			// first iteration:
			// the last position in result array gets the value
			// at the beginning of list (i.e. 2)
		}
		
		return result; // return the int array
	} // end reverse method
	

}