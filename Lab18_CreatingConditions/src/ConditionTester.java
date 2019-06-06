





/*
	This is the ConditionTester template. Use this class to test simple boolean methods!

	Coded by: Sidharth K.
	Date:
	chose to do both problems
*/

import java.awt.Color;
import java.util.Scanner;
import java.util.logging.Level;

import javax.swing.JPanel;

public class ConditionTester {
	public static void main(String[] args) {
		boolean abc = true;
		
		while (abc) {
		Scanner kboard = new Scanner(System.in);

		System.out.println("What conditions would you like to test?");
		System.out.println(
				"(1)Test Leap Year");
		
		System.out.println("(2) Check if point is in rectangle");
		System.out.println("(3) Check if number has two ending zeroes");
		System.out.println("(4) Check if a date is later than another");
		System.out.println("(5) Get the amount to pay given the number of books");
		System.out.println("(6) Get the closest primary/secondary color for a gven color");
		
		 	
	CharSequence i1 = "Test Leap Year";
	CharSequence i2 = "Check if point is in rectangle";
	CharSequence i3 = "Check if number has two ending zeroes";
	CharSequence i4 = "Check if a date is later than another";
	CharSequence i5 = "Get the amount to pay given the number of books";
	CharSequence i6 = "Get the closest primary/secondary color for a gven color";
	//a = kboard.nextLine();
		
int result = kboard.nextInt();

		if (result == 1) {
			System.out.println("Enter the Year");
			int b = kboard.nextInt();
			ConditionTester tester = new ConditionTester();
			boolean res = tester.isLeapYear(b);
			System.out.println("The result of the test: " + res);
		} else if (result == 2) {
			System.out.print("Enter the x coordinate of the point --> ");
			int xyz = kboard.nextInt();


			System.out.print("Enter the y coordinate of the point --> ");
			int b = kboard.nextInt();
			System.out.print("Enter the x coordinate of the rectangle--> ");
			int c = kboard.nextInt();

			System.out.print("Enter the y coordinate of the rectangle --> ");
			int d = kboard.nextInt();
			System.out.print("Enter the width of the rectangle --> ");
			int e = kboard.nextInt();

			System.out.print("Enter the height of the rectangle --> ");
			int f = kboard.nextInt();

			// Change this code so that it calls your testing method.
			ConditionTester tester = new ConditionTester();
			boolean res = tester.isPointInRectangle(xyz, b, c, d, e, f);
			System.out.println("The result of the test: " + res);

		} else if (result == 4) {

			System.out.print("Enter the first day --> ");
			int aei = kboard.nextInt();

			System.out.print("Enter the second day --> ");
			int b = kboard.nextInt();
			System.out.print("Enter the first month --> ");
			int c = kboard.nextInt();

			System.out.print("Enter the second month --> ");
			int d = kboard.nextInt();
			System.out.print("Enter the first year --> ");
			int e = kboard.nextInt();

			System.out.print("Enter the second year --> ");
			int f = kboard.nextInt();

			// Change this code so that it calls your testing method.
			ConditionTester tester = new ConditionTester();
			boolean res = tester.isLater(aei, b, c, d, e, f);

			// Printing out the result of the test!
			System.out.println("The result of the test: " + res);
		} else if (result == 3) {
			System.out.print("Enter the number --> ");
			int a = kboard.nextInt();
			ConditionTester tester = new ConditionTester();
			boolean res = tester.hasTwoEndingZeroes(a);

			// Printing out the result of the test!
			System.out.println("The result of the test: " + res);
			
		} else if(result == 6) {
				System.out.println("Enter the color in rgb");
				System.out.println("Enter the value of the color in r");
				int r = kboard.nextInt();
				System.out.println("Enter the g value");
				int g = kboard.nextInt();
				System.out.println("Enter the b value");
				int b = kboard.nextInt();
				System.out.println("The best match for these values is " + bestMatch(r, g, b));
	
			} else if (result == 5) {
				System.out.println("# of bp");
				int bp = kboard.nextInt();
				System.out.println("# of nb");
				int nb = kboard.nextInt();
				System.out.println("Your price is --> " + getOrderTotal(bp, nb));
			}
			
			
		}
		
		
		}
	

	// This method tests the parameters in some way, then returns the result of the
	// test
	public boolean exampleTestMethod(int x, int y) {

		boolean result = false;

		// Complete your if statement (or series of if statements) here
		// if ...
			
		return result;
	}

	public boolean isLeapYear(int year) {
		// checks if number returns true if it is a leap year and false if it is not
		if (year % 4 == 0) {
			if ((year % 100 == 0 && year % 400 == 0)) {
				// checks if the year is divisible by 100 and 400
				return true;
			} else {
				return true;
			}

		}
		return false;

	}

	public boolean isLater(int day1, int day2, int month1, int month2, int year1, int year2) {
		// returns true if the first date is later than the second date
		if (year1 > year2) {
			// checks if year of first date is later
			return true;
		} else if (year1 == year2 && month1 > month2) {
			// checks if years are equal and month1 is later than month2
			return true;

		} else if (year1 == year2 && month1 == month2 && day1 > day2) {
			// checks if year and months are equal and day1 is later than day2
			return true;
		}
		return false;
		// if anything else false is returned
	}

	public boolean hasTwoEndingZeroes(int x) {
		if (x % 100 == 0 && x % 10 == 0) {
			// checks if number is divisible by 1 and 2
			return true;
		} else {
			return false;
		}

	}

	public boolean isPointInRectangle(int x, int y, int rectX, int rectY, int rectWidth, int rectHeight) {

		if (x == rectX && y == rectY) {
			// checks if coordinates are equal
			return true;
		}

		else if (rectX > x || rectY > y) {
			// checks if either of the top right coordinates of the rectangle are greater
			// than the coordinates of the point
			return false;
		} else if (rectX <= x && rectY <= y) {
			// if not
			if (rectX + rectWidth >= x && rectY + rectHeight >= y) {
				// if the top left y + the height is greater or equal to y and top left x +
				// width is greater than or equal to x
				return true;
			}
		}
		return false;

	}
	public static double getOrderTotal(int bp, int nb) {
		
		if (bp  == 1 && nb == 1) {
			return 37.95;
		} else if (bp >= 1 && nb >= 1 && bp + nb >= 3 && bp + nb < 12) {
			return(double)( (bp+nb)* 15.95);
		} else if (bp + nb >= 12) {
			return (double)(bp + nb * 14.00);
			
		} else {
			return bp * 18.95 + nb * 21.95;
		}
		
	}
	
	public static Color bestMatch(int r, int g, int b) {
		
		if (r > g && r > b) {
			return Color.RED;
		}
		else if (g > r && g > b) {
			return Color.GREEN;
		} 
		else if (b > r && b > g) {
			return Color.BLUE;
		}
		else if (r == g && r > b) {
		return Color.YELLOW;
	}
	else if (b == g && b > r) {
		return Color.cyan;
}
else if (r == b && r > g) {
	return Color.MAGENTA;
} else {
	return Color.GRAY;
}
	
	
	}
	
	
	public static int levenshteinDistance (CharSequence lhs, CharSequence rhs) {                          
	    int len0 = lhs.length() + 1;                                                     
	    int len1 = rhs.length() + 1;                                                     
	                                                                                    
	    // the array of distances                                                       
	    int[] cost = new int[len0];                                                     
	    int[] newcost = new int[len0];                                                  
	                                                                                    
	    // initial cost of skipping prefix in String s0                                 
	    for (int i = 0; i < len0; i++) cost[i] = i;                                     
	                                                                                    
	    // dynamically computing the array of distances                                  
	                                                                                    
	    // transformation cost for each letter in s1                                    
	    for (int j = 1; j < len1; j++) {                                                
	        // initial cost of skipping prefix in String s1                             
	        newcost[0] = j;                                                             
	                                                                                    
	        // transformation cost for each letter in s0                                
	        for(int i = 1; i < len0; i++) {                                             
	            // matching current letters in both strings                             
	            int match = (lhs.charAt(i - 1) == rhs.charAt(j - 1)) ? 0 : 1;             
	                                                                                    
	            // computing cost for each transformation                               
	            int cost_replace = cost[i - 1] + match;                                 
	            int cost_insert  = cost[i] + 1;                                         
	            int cost_delete  = newcost[i - 1] + 1;                                  
	                                                                                    
	            // keep minimum cost                                                    
	            newcost[i] = Math.min(Math.min(cost_insert, cost_delete), cost_replace);
	        }                                                                           
	                                                                                    
	        // swap cost/newcost arrays                                                 
	        int[] swap = cost; cost = newcost; newcost = swap;                          
	    }                                                                               
	                                                                                    
	    // the distance is the cost for transforming all letters in both strings        
	    return cost[len0 - 1];                                                          
	}
	
	
	
	

}
