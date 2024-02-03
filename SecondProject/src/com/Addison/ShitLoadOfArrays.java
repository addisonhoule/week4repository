package com.Addison;

import java.util.List;

public class ShitLoadOfArrays {

	public static void main(String[] args) {

		String dashes = "------------------\n";

		System.out.println("Question 1:");

//	I'm making an array called ages, with the ages y'all desired.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

//	Now I'm programmatically subtracting the first element from the last element of the array.
		int tubularMathDude = ages[ages.length - 1] - ages[0];
		System.out.println(tubularMathDude);

//	It's time for another array. This one is going to be longer than the last one. 
//	I was going to use int[] ages2 = new int[9]; and individually add values using ages2[0]=int value through ages2[8]=int value, but that seemed to tedious.

		int[] ages2 = { 4, 5, 78, 26, 4832, 234, 7346, 2342, 753 };

//	Look! Length is dynamic, based on the length of the array!
		int tubularMathDude2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(tubularMathDude2);

//	Time to find the average. I'll make it a double, because there will probably be decimal places.
		double ageSum = 0;
		for (int age : ages2) {
			ageSum += age;
		}
		System.out.println(ageSum / ages2.length);
		System.out.println(dashes);

		System.out.println("Question 2:");

//	It's time to get some names together in an array. Strings instead of integers, oh my heck.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

//	I'm making one note for both of these: first one will be calculating average number of letters (there will be decimal points), second will be concatenating and separating by spaces. 
		double nameSum = 0;
		for (String name : names) {
			nameSum += name.length();
		}
		System.out.println(nameSum / names.length);

		String spacedNames = "";
		for (String name : names) {
			spacedNames += name + " ";
		}
		System.out.println(spacedNames);
		System.out.println(dashes);

		System.out.println("Question 3:");
//		Accessing first element of an array.
		System.out.println(names[names.length - 1]);
		System.out.println(dashes);

		System.out.println("Question 4:");
//		Accessing last element of an array.
		System.out.println(names[0]);
		System.out.println(dashes);

//		System.out.println("Question 5:");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
//		System.out.println(dashes);

		System.out.println("Question 6:");
		int lengthSum = 0;
		for (int name : nameLengths) {
			lengthSum += name;
		}
		System.out.println(lengthSum);
		System.out.println(dashes);

		System.out.println("Question 7:");
		System.out.println(threepeat("Hello", 3));
		System.out.println(dashes);

		System.out.println("Question 8:");
		System.out.println(fullName("Popeye", "theSailor"));
		System.out.println(dashes);

		System.out.println("Question 9:");
		System.out.println(bigHundo(ages));
		System.out.println(bigHundo(nameLengths));
		System.out.println(dashes);

		System.out.println("Question 10:");
		double[] scoopy = { 4.4, 6.6, 8.8 };
		System.out.println(avgDubby(scoopy));
		System.out.println(dashes);

		System.out.println("Question 11:");
		double[] doopy = { 3.3, 11.11 };
		System.out.println(firstBigger(scoopy, doopy));
		System.out.println(firstBigger(doopy, scoopy));
		System.out.println(dashes);

		System.out.println("Question 12:");
		System.out.println(willBuyDrink(true, 7.50));
		System.out.println(willBuyDrink(true, 22.50));
		System.out.println(willBuyDrink(false, 6.53));
		System.out.println(willBuyDrink(false, 13.25));
		System.out.println(dashes);
		
		System.out.println("Question 13:");
		String[] arrayOne = {"Young Hercules", "The Young and the Restless", "Young Sheldon"};
		String[] arrayTwo = {"Young Sheldon", "Young Dracula", "30 Rock"};
		String[] arrayThree = {"Young Rock", "Young Sheldon", "30 Rock"};
		String[] arrayFour = {"The News", "Other Show", "Being Athletic or Whatever"};
		System.out.println(youngRockPoints(arrayOne));
		System.out.println(youngRockPoints(arrayTwo));
		System.out.println(youngRockPoints(arrayThree));
		System.out.println(youngRockPoints(arrayFour));
		
		
		
		

	}
//		For question 13. I'd like to award points to people who have watched television shows that start with the word
//		"Young" or end with the word "Rock." Points are the thing we're constantly yearning for, and a metric for this
//		seems like a real treat. Extra points will be awarded if they watch Young Rock, in addition to standard scoring. 
//		I would no get the extra points... yet.

	public static String youngRockPoints(String[] yr) {
		int points = 0;
		for (String show : yr) {
			if (show.startsWith("Young")) {
				points += 1;
			}
			if (show.endsWith("Rock")) {
				points += 1;
			}
			if (show == "Young Rock") {
				points += 3;
			}
		} if (points < 1) {
			return "Don't tell Dwayne. You scored: " + points + " points...";
		}
		else if (points < 3) {
			return "Yeesh. Our urgency never grows. You scored: " + points + " points.";
		}
		else if (points < 7) {
			return "Really outstanding counting, kid. You scored: " + points + " points.";
		} else {
			return "JOHNSON! You scored: " + points + " points!";
		}
	}

//		For question 12. Return boolean.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside != true || moneyInPocket <= 10.50) {
			return false;
		} else {
			return true;
		}
	}

//		For question 11. Return boolean.
	public static boolean firstBigger(double[] x, double[] y) {
		double avgX = 0;
		double avgY = 0;
		for (double i : x) {
			avgX += i;
		}
		for (double i : y) {
			avgY += i;
		}
		avgX = avgX / x.length;
		avgY = avgY / y.length;
		if (avgX > avgY) {
			return true;
		} else
			return false;
	}

//		For question 10. Return double.
	public static double avgDubby(double[] d) {
		double sum = 0;
		for (double i : d) {
			sum += i;
		}
		return sum / d.length;
	}

//		For question 9. Returns boolean.
	public static boolean bigHundo(int[] n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}

//		For question 8. Needs to return string.
	public static String fullName(String fName, String lName) {
		return fName + " " + lName;
	}

//		For question 7. Needs to return a string.
	public static String threepeat(String word, int n) {
		String bigWord = "";
		for (int i = 0; i < n; i++) {
			bigWord += word;
		}
		return bigWord;
	}
}
