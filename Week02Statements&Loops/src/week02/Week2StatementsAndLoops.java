//package week02;
//
//import java.util.Scanner;
//
//public class Week2StatementsAndLoops {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter your name: ");
//		String enteredName = sc.nextLine();
//		
//		System.out.println("Welcome, " + enteredName);
//		
//		int selection = 0;
//		double total = 0;
//		
//		while (selection != 4) {
//			System.out.println("Select an option.");
//			System.out.println("1) Add Chocy Milk to shopping cart: 5.98");
//			System.out.println("2) Add Bagels to shopping cart: 4.50");
//			System.out.println("3) Add Chicken to shopping cart: 12.48");
//			System.out.println("4) Check out!");
//			
//			selection = sc.nextInt();
//			
//			switch (selection) {
//			case 1:
//				total += 5.98;
//				break;
//			case 2:
//				total += 4.50;
//				break;
//			case 3:
//				total += 12.48;
//				break;
//			case 4:
//				break;
//			default:
//				System.out.println("Pick a valid option. ");
//			}
//		}
//
//		System.out.println("Your total is " + total);
//		
//	}
//
//}


//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject:  Boolean & Conditionals Lab
//Java Week 02 Lab  
//
package week02;

public class Week2StatementsAndLoops {
	
	public static void main(String[] args) {
		
		//
		// BOOLEANS and CONDITIONALS:
		//
		
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14
			int age = 14;
		
		
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.
			System.out.println(age >= 16);
			
			age = 18;
			System.out.println(age >= 16);

		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
		//
		//		a. Change the value of age and rerun to see the result
			age = 20;
			if (age >= 16) {
				System.out.println("You can drive!");
			} else {
				System.out.println("You cannot drive");
			}
			
		
		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional.
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true.
		//		c. Try changing the values of age and hasLicense and note the different results.
			age = 20;
			boolean hasLicense = true;
			
			if (age >= 16 && hasLicense) {
				System.out.println("You can drive with license!");
			} else {
				System.out.println("You cannot drive");
			}
		
		
		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		//		c. Change the values and note the different results.
			double costOfMilk = 5.59;
			int thirstLevel = 9;
			if (costOfMilk <= 2.50 || thirstLevel >= 6) {
				System.out.println("Milk Please");
			} else {
				System.out.println("No Thanks");
			}
		
		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"
			int numberOfCookies = 22;
			int numberOfChildren = 4;
			
			int cookiesLeft = numberOfCookies % numberOfChildren;
			if (cookiesLeft > 0) {
				if (cookiesLeft < 2) {
					System.out.println("Yes!");
				} else if (cookiesLeft < 5) {
					System.out.println("Whoohooo");
				} else if (cookiesLeft > 5) {
					System.out.println("Jackpot!");
				}
			} else {
				System.out.println("Sad Face");
			}
		
				
		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale: 
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
			String loyaltyMemberStatus = "Silver";
			double loyaltyMemberDiscount = 0.0;
			
			switch(loyaltyMemberStatus) {
			case "Silver":
				loyaltyMemberDiscount = .10;
				break;
			case "Gold":
				loyaltyMemberDiscount = .15;
				break;
			case "Platinum":
				loyaltyMemberDiscount = .25;
				break;
			default:
				loyaltyMemberDiscount = 0.0;
			}
			System.out.println(loyaltyMemberDiscount);
		
		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
			double billTotal = 100.58;
			double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
			
			if (adjustedTotal > 500) {
				switch(loyaltyMemberStatus) {
				case "Silver":
					loyaltyMemberStatus = "Gold";
					break;
				case "Gold":
					loyaltyMemberStatus = "Platinum";
					break;
				}
			}

		
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise
			String userName = "Tommy123";
			String password = "12345";
			
			if (userName.equals("Tommy123") && password.equals("12345")) {
				System.out.println("login successful");
			} else {
				System.out.println("access denied");
			}
		
		//
		// LOOPS:
		//
		
		// 10. Write a for loop that prints each number from 0 to 9
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		
		
		// 11. Write a for loop that prints each number from 10 to 0 backwards
			for(int i = 10; i >= 0; i--) {
				System.out.println(i);
			}
		
		
		// 12. Write a for loop that prints every other number from 0 to 100
			for (int i = 0; i <= 100; i += 2) {
				System.out.println(i);
			}
		
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd
			for (int i = 0; i <= 100; i++) {
				if (i % 2 == 0) {
					System.out.println("Is Even");
				} else {
					System.out.println("Is Odd");
				}
			}
		
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.
		int i = 100;
		while (i > 0) {
			i--;
			System.out.println(i + " " + i % 3);
		}
		
		boolean a = true;
		boolean b = true;
		boolean c = true;
		
        boolean result = (a && b) || (a && c) || (b && c);
        System.out.println(result);
        
        
        
        String randomWord = "Stoney";
        System.out.println(randomWord.length());
        if (randomWord.length() > 10) {
            System.out.println("That is a really long word!");
        } else {
            System.out.println("Your word is not that long.");
        }
        
        
        int num1 = 156;
        int myNumber = 100;
        if (num1 < myNumber) {
            System.out.println(num1 + " is smaller than my number, " + myNumber);
        } else if (num1 > myNumber) {
             System.out.println(num1 + " is larger than my number, " + myNumber);
        } else if (num1 == myNumber) {
              System.out.println(num1 + " is equal to my number, " + myNumber);
        }
        
        
        int userNumber = 100;
    	for (int o = 1; o <= 100; o++) {
    	    if (o == userNumber) {
    	        int numPlus = userNumber - 1;
    	        while (numPlus < 100) {
    	           numPlus++;
    	           System.out.println(numPlus);
    	        }
    	        break;
    	    } else if (i >= 100){
    	        System.out.println("Your number was not between 1 and 100.");
    	        break;
    	    }
    	}
    	
    	int num2 = 1;
        for (int u = 1; u <=10; u++) {
            System.out.println(num2 + " x " + u + " = " + (num2 * u));
        }
        
        int numToAdd = 8;
        int howManyTimes = 3;
        int sumResult = 0;
        
        int timesRan = 0;
        do {
            sumResult += numToAdd;
            timesRan =+ 1;
        } while (timesRan <= howManyTimes);
        
        System.out.println(sumResult);
        
        
        //Better yet! Instead of creating a new variable, just edit howManyTimes to be less each time!
        do {
            sumResult += numToAdd;
            howManyTimes--;
        } while (howManyTimes > 0);
        
        
		  int day = 6;

		  int month = 4;

		  boolean isSummer = month >= 6 && month <= 8;

		  boolean isWeekday = day < 6;

		  if (isSummer || !isWeekday) {

		    System.out.println("Definitely going to sleep in!");

		  } else {

		    System.out.println("Probably need to wake up at a decent time.");

		  }

		  
		  
		  String name = "Tommy";

		  int age2 = 52;

		  if (name == "Tommy") {

		    System.out.println("Hi, Tommy!");

		  } else if (age2 == 52) {

		    System.out.println("52 years old.");

		  }

		  System.out.println("Out of conditional.");

	}

}