//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Labs {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] randomNumbers = new int[6];
		randomNumbers[0] = 1;
		randomNumbers[1] = 5;
		randomNumbers[2] = 2;
		randomNumbers[3] = 8;
		randomNumbers[4] = 13;
		randomNumbers[5] = 6;
		
		// 2. Print out the first element in the array
		System.out.println(randomNumbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(randomNumbers[randomNumbers.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
			//System.out.println(randomNumbers[6]); EXCEPTION
		
		// 5. Print out the element in the array at position -1, what happens?
			//System.out.println(randomNumbers[-1]); //EXCEPTION
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("-------------");
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println(randomNumbers[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("-------------");
		for (int num : randomNumbers) {
			System.out.println(num);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("-------------");
		int sum = 0;
		for (int num : randomNumbers) {
			sum += num;
		}
		System.out.println(sum);
		
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum / randomNumbers.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		System.out.println("-------------");
		for (int num : randomNumbers) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = new String[4];
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		
		// 12. Calculate the sum of all the letters in the new array
		int sumNumOfNames = 0;
		for (String name : names) {
			sumNumOfNames += name.length();
		}
		System.out.println("-------------");
		System.out.println(sumNumOfNames);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greetName("Skywalker");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		String greeting = createGreeting("Skywalker");
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		// one returns a greeting and I had to specify the type to String instead of Void
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		boolean isLonger = printStrings("Hola ", 4);
		System.out.println(isLonger);
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		int[] numbers = new int[3];
		numbers[0] = 8;
		numbers[1] = -5;
		numbers[2] = 10;
		boolean doesNumExist = isInArray(numbers,10);
		System.out.println("Does num exist in array: " + doesNumExist);
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int smallest = findSmallest(numbers);
		System.out.println("Smallest num: " + smallest);
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] doubleNums = new double[3];
		doubleNums[0] = 12.56;
		doubleNums[1] = 43.04;
		doubleNums[2] = 30.20;
		double doubleAverage = averageDoubles(doubleNums);
		System.out.println(doubleAverage);

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] intArray = convertToInt(names);
		//System.out.println("intArray: " + intArray);
		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		boolean bool = evenVsOdd(names);
		System.out.println("Does even win? " + bool);
		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println(isPalindrome("eminem"));
		
	}
	

	
	// Method 13:
	static public void greetName(String name) {
		System.out.println("Greetings young " + name + "!");
	}

	// Method 14:
	static public String createGreeting(String name) {
		return "Greetings young " + name + "!";
	}
	
	// Method 15:
	static public boolean printStrings(String text, int num) {
		return text.length() > num;
	}

	
	// Method 16:
	static public boolean isInArray(int[] numbers, int num) {
		for (int readNum : numbers) {
			if (readNum == num) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:
	static public int findSmallest(int[] numbers) {
		int smolNum = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i - 1] > numbers[i]) {
				smolNum = numbers[i];
			}
		}
		return smolNum;
	}
	
	// Method 18:
	static public double averageDoubles(double[] doubles) {
		double sum = 0.0;
		for (double num : doubles) {
			sum += num;
		}
		return sum / doubles.length;
	}
	
	// Method 19:
	static public int[] convertToInt(String[] names) {
		int[] intArray = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			intArray[i] = names[i].length();

			System.out.println( names[i].length());
		}
		return intArray;
	}
	
	// Method 20:
	static public boolean evenVsOdd(String[] names) {
		int evenNum = 0;
		int oddNum = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() % 2 == 0) {
				//isEven
				evenNum += names[i].length();
			} else {
				//isOdd
				oddNum += names[i].length();
			}
		}
		return evenNum > oddNum;
	}
	
	// Method 21:
	static public boolean isPalindrome(String word) {
		String backWord = "";
		for (int i = 0; i < word.length(); i++) {
			backWord += word.charAt(word.length() - 1 - i);
			System.out.println(backWord);
		}
		return word.equals(backWord);
	}

}