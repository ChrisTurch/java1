package java1;
/**
 * Java. Level 1. Lesson 3. Homework
 *
 * @author Christina Turchina
 * @version dated Nov 28, 2018
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lesson3 {
	public static void main(String[] args) {
		// task 1
		guessingNumber();
		// task 2
		guessingWord();
	}

	static void guessingNumber() {
		Scanner keyboard = new Scanner(System.in);
		int randomnumber = new Random().nextInt(10);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter number from 0 to 9 ");
			int inputnumber = keyboard.nextInt();
			if (inputnumber == randomnumber) {
				System.out.println("You guessed.");
				break;
			} else {
				System.out.println("You did'n guess, try again.");
			}
		}
		System.out.println("Try again? 1 - yes / 0 - no");
		int decision = keyboard.nextInt();
		if (decision == 1) {
			guessingNumber();
		}
	}

	static void guessingWord() {
		Scanner keyboard = new Scanner(System.in);
		String[] words = { "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
				"garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
				"pear", "pepper", "pineapple", "pumpkin", "potato" };
		int randomword = new Random().nextInt(25);
		for (int i = 0; i < words.length; i++) {
			System.out.println("Enter your word ");
			String inputword = keyboard.next();
			char[] outputword = { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', };
			if (inputword.equals(words[randomword])) {
				System.out.println("You guessed");
				break;
			} else {
				String str = words[randomword];
				for (int j = 0; j < inputword.length(); j++) {
					if (inputword.charAt(j) == str.charAt(j)) {
						outputword[j] = inputword.charAt(j);
					}

				}
				System.out.println(Arrays.toString(outputword));
				continue;
			}
		}
	}
}
