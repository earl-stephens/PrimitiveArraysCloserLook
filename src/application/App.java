package application;

import java.util.Scanner;

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
		
		/* Coding challenge
		 * Write a program that gets three numbers input by the user (keep 
		 * asking until they have entered exactly 3 numbers),
		 * prints the numbers entered, prints the total of the numbers
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int userInput[] = new int[3];
		System.out.println("The program takes in 3 numbers, outputs the numbers and their total.");
		int counter = 0;
		
		while(counter < 3) {
			System.out.println("Enter an integer > ");
			userInput[counter] = scanner.nextInt();
			counter++;
		}
		
		scanner.close();
		int total = 0;
		
		System.out.println("You entered the following numbers:");
		for(int i = 0; i < 3; i++) {
			System.out.println(userInput[i]);
			total = total + userInput[i];
		}
		
		System.out.println("The total value of the numbers entered is: " + total);
		
	}

}
