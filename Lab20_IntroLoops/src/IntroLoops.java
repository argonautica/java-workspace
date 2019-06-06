import java.util.Scanner;

public class IntroLoops {
	static int len;
	static boolean abc = true;

	public static void main(String[] args) {

		int total = 0;
		for (int x = 0; x < 10; x++) {

			total = total + x;
		}
		System.out.println(total);
		do {
			Scanner kboard = new Scanner(System.in);
			System.out.println("---MENU---");
			System.out.println("What would you like to see?");
			System.out.println("1) Division");
			System.out.println("2) Exercise 1(Print Series)");
			System.out.println("3) Exercise 2(Print Word) ");
			System.out.println("4) Exercise 3 (Average Square Root)");

			System.out.println("5.) Print Index Line");
			System.out.println("6) Exercise 2 (Sum of Fractions)");
			System.out.println("7) Find Triangle Area");
			System.out.println("8) Add odd numbers");
			System.out.println("9) Fibonacci");
			// System.out.println("10) Clear Console");

			System.out.println("11) Quit");

			System.out.print("-----> ");
			int menuChoice = kboard.nextInt();

			if (menuChoice == 1) {

				System.out.println("enter m");
				int m = kboard.nextInt();
				System.out.println("enter n");
				int n = kboard.nextInt();

				divide(m, n);
			} else if (menuChoice == 2) {
				System.out.println("enter the value you wish to start with");
				int start = kboard.nextInt();
				System.out.println("enter the value you want to end with");
				int end = kboard.nextInt();

				printSeries(start, end);

			} else if (menuChoice == 3) {
				System.out.println("Enter the Word");
				String a = kboard.next();

				repeatWord(a);
			} else if (menuChoice == 4) {
				System.out.println("enter the number of numbers you wish to average");
				int m = kboard.nextInt();
				exercise3(m);

			} else if (menuChoice == 5) {

				/*
				 * System.out.println("enter word one");
				 * 
				 * String a = kboard.nextLine(); System.out.println("enter word 2"); String b =
				 * kboard.nextLine(); printIndexLine(a, b);
				 */

				String str1, str2;
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first word : ");
				str1 = scan.nextLine();
				System.out.println("Enter second word : ");
				str2 = scan.nextLine();

				len = str1.length() + str2.length();
				printIndexLine(str1, str2);
			} else if (menuChoice == 6) {

				Scanner scan = new Scanner(System.in);
				System.out.println("Enter number");
				int a = scan.nextInt();

				exercise2(a);
			}

			else if (menuChoice == 8) {
				System.out.println("Enter the total number");
				int m = kboard.nextInt();
				addOdds(m);

			} else if (menuChoice == 11) {

				break;
			} else if (menuChoice == 10) {
				System.out.close();

			}

			else if (menuChoice == 7) {
				System.out.println("Enter the length of the triangle's side");
				int m = kboard.nextInt();
				findtriangular(m);

			}

			else if (menuChoice == 9) {
				System.out.println("Enter the number");
				int m = kboard.nextInt();
				Fibonacci(m);

			}

			else {

				System.out.println("enter word one");

				String a = kboard.next();
				System.out.println("enter word 2");
				String b = kboard.next();
				printIndexLine(a, b);
			}

		} while (abc);

	}

	public static void divide(int m, int n) {
		// division without using a division operator
		int q = 0;

		while (m > n) {
			m = m - n;
			q++;

		}
		// quotient and remainder are returned
		System.out.println("Quotient = " + q + "  and the remainder = " + m);
	}

	public static void printSeries(int start, int end) {
		// The program checks if the first number is less than the second number before
		// printing the numbers between the two
		if (start < end) {
			for (int x = start; x < end + 1; x++) {
				System.out.println(x);
			}
		}

		else {
			System.out.println(" the start value is greater than the end value");
		}

	}

	public static void repeatWord(String word) {
		// checks the length of the word and then prints it out the number of times that
		// it has letters
		int len = word.length();
		for (int x = 0; x < len; x++) {
			System.out.println(word);
		}

	}

	public static void printIndexLine(String word1, String word2) {
		// gets the length of both the letters
		System.out.print(word1);
		// prints dots in between the words until the total length is 30
		while (len < 30) {
			System.out.print(".");
			len++;
		}
		System.out.println(word2);

	}

	public static void exercise1(int a) {
		Scanner kboard = new Scanner(System.in);
		int total = 0;

		for (int x = 0; x < a; x++) {
			System.out.println("enter your integer number " + a);
			int eaa = kboard.nextInt();
			total = eaa + total;
			System.out.println(total);

		}

	}

	public static void exercise2(int a) {

		double total = 0;
		for (int x = 1; x < a; x++) {
			double c = (double) 1 / a;
			total = total + c;
		}

		System.out.println(total);

	}

	public static void exercise3(int a) {
		// calculates the standard deviation given a series of numbers
		int total = 0;
		int nums = a;
		int avgtotal = 0;
		Scanner kboard = new Scanner(System.in);
		for (int x = 1; x < a + 1; x++) {
			System.out.println("enter int " + x);
			int z = kboard.nextInt();
			System.out.println(" z is " + z);
			total = total + z;
			avgtotal = avgtotal + (z * z);
			// System.out.println(avgtotal);

		}

		System.out.println(avgtotal);
		double avgsquare = (double) avgtotal / nums;

		System.out.println(avgsquare + " is average");
		double avg = (double) (total / nums);
		double sd = Math.sqrt(avgsquare - Math.pow(avg, 2));

		System.out.println(" The standard deviation of these numbers is " + sd);

	}

	public static void findtriangular(int a) {
		// finds the area of a triangle given a sides length
		int c = 0;
		for (int x = 0; x < a + 1; x++) {
			c = c + x;

		}
		System.out.println(" The number of circles is " + c);
	}

	public static void addOdds(int n) {
		int total = 0;

		for (int a = 0; a < n + 1; a++) {

			if (a % 2 != 0) {
				total = total + a;
			}
		}

		System.out.println("The total is " + total);

	}

	public static void sumDigits(int n) {

		String x = "" + n;
		if (n > 0) {
			int len = x.length();
			int total = 0;

			for (int a = 0; a < n + 1; n++) {

				int b = x.charAt(a);

				total = total + b;
			}
			System.out.println(" The total is " + total);
		}
	}

	public static void Fibonacci(int n) {

		// calculates the nth number of the fibonacci sequence
		int int1 = 0;
		int int2 = 1;

		for (int x = 0; x < n - 2; x = x + 2) {

			int1 = int1 + int2;
			int2 = int2 + int1;

		}

		if (n % 2 == 0) {

			System.out.println("The " + n + "th number of the sequence is " + int2);
		} else {
			System.out.println("The " + n + "th number of the sequence is " + int1);
		}
	}

}
