package application;

public class App {

	public static void main(String[] args) {
		//this is reserving part of the computer's memore big enough for 
		//the native int data type
		int number1;
		
		//number refers to an array, but is not itself an array
		//the assignment part is what creates the array
		int number[] = {2, 4, 6, 8};
		
		/* What if you know how many elements the array will hold,
		 * but don't know what the elements are yet?  You can initialize
		 * the array using the following (you've allocated enough space
		 * in memory for an array of 3 integers):
		 */
		
		int numbers[] = new int[3];
		System.out.println(numbers.length);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(numbers[i]);
			//shows that Java has initialized all the values to 0
		}
	}

}
