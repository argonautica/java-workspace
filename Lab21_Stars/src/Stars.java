import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Stars {
	public static boolean on = true;

	public static void main(String[] args) {
		do {
			System.out.println();
			Scanner kboard = new Scanner(System.in);
			System.out.println("---MENU---");
			System.out.println("What would you like to see?");
			System.out.println("0) Stars ");
			System.out.println("1) Star Square");
			System.out.println("2) Star Triangle");
			System.out.println("3 Inverted star triangle");
			System.out.println("4) Star Pyramid");
			System.out.println("5 Star Diamond"); 
			System.out.print("-----> ");
			int menuChoice = kboard.nextInt();
			if (menuChoice == 0) {

				System.out.println("enter the width of the line of stars");
				int height = kboard.nextInt();
				Stars_(height);
			}
			else if (menuChoice == 1) {

				System.out.println("enter the width of the square");
				int height = kboard.nextInt();
				printSquare(height);
			} else if (menuChoice == 2) {

				System.out.println("enter the height of the triangle");
				int height = kboard.nextInt();
				printTriangle(height);
			} else if (menuChoice == 3) {

				System.out.println("enter the height of the triangle");
				int height = kboard.nextInt();
				printInvertedTriangle(height);
			
		} else if (menuChoice == 4) {

			System.out.println("enter the height of the triangle");
			int height = kboard.nextInt();
			StarPyramid(height);
		} else if (menuChoice ==5 ) {
			
			System.out.println("enter the height of the diamond");
			int height = kboard.nextInt();
			StarDiamond(height);
		}

		} while (on);
	}

	
	
	
	public static void Stars_(int width) {
		// prints a line of stars
		for (int i = 0; i < width; i++) {
			
			
			System.out.print("*");
		}
		
		
	}
	public static void printSquare(int height) {
//  prints out  a square of stars
		for (int i = 1; i <= height; i++){

			for (int b = 1; b <= height; b++) {

				System.out.print("* ");

			}

			System.out.println();
		}

	}

	public static void printTriangle(int height) {
		// prints  a right triangle with its side on the left

		for (int i = 1; i <= height; i++) {
			for (int b = 1; b <= i; b++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void printInvertedTriangle(int height) {
		// prints  a right triangle with its side on the right
		for (int i = 1; i <= height; i++) {

			for (int b = 1; b <= (height - i); b++) {

				System.out.print(" ");
			}

			for (int z = 0; z < i; z++) {

				System.out.print("*");
			}

			System.out.println();

		}

	}
	public static void StarPyramid(int height) {
		// prints out a pyramid of stars
		for ( int i = 1; i <= height; i++) {
			
			for (int b = 1; b<=height-i; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= 1 +((i-1)*2); c++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
		
	}
	
	
	public static void StarDiamond(int height) {
		
		if (height %2 != 0) {
	// if height is odd
			 int number = height-(((height-1) /2) );
		        int count = number - 1;
		        for (int k = 1; k <= number; k++) {
		            for (int i = 1; i <= count; i++)
		                System.out.print(" ");
		            count--;
		            for (int i = 1; i <= 2 * k - 1; i++)
		                System.out.print("*");
		            System.out.println();
		        }
		        count = 1;
		        for (int k = 1; k <= number - 1; k++) {
		            for (int i = 1; i <= count; i++)
		                System.out.print(" ");
		            count++;
		            for (int i = 1; i <= 2 * (number - k) - 1; i++)
		                System.out.print("*");
		            System.out.println();
		        }
		}
		else {
			
			
			
// if height is an even number
			
			
			 int number = height-(((height-1) /2) );
		        int count = number - 1;
		        for (int k = 1; k < number; k++) {
		            for (int i = 1; i <= count; i++)
		                System.out.print(" ");
		            count--;
		            for (int i = 1; i <= 2 * k - 1; i++)
		                System.out.print("*");
		            System.out.println();
		        }
		        count = 1;
		        for (int k = 1; k <= number; k++) {
		            for (int i = 1; i <= count; i++)
		                System.out.print(" ");
		            count++;
		            for (int i = 1; i <= 2 * (number - k)  -1; i++)
		                System.out.print("*");
		            System.out.println();
		        }
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}