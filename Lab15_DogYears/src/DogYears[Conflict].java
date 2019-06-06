
/**
 * @(#)DogYears.java
 *

  For testing purposes:
  Dog age of 1 = Human age 13
  Dog age of 2 = Human age 18
  Dog age of 5 = Human age 34
  Dog age of 8 = Human age 50
  Dog age of 12 = Human age 72

 *
 * @author
 * @version
 */

import java.math.*;
import java.util.Scanner;

public class DogYears {

	public double convertToHumanYears(double dog) {
		double human = 0;
		if (dog == 1) {

			human = 13;
			return human;
		}

		else if (dog >= 1) {

			human = 13;
			dog = dog - 1;

			if (dog % 3 != 0) {

				double temp = dog / 3;

				human = human + (temp * 16);

				int returnval = (int) Math.round(human);

				return returnval;

			} else {

				human = (dog / 3) * 16;
				return human;
			}

		}

		return human;
	}

	public double convertToDogYears(double human) {

		double dog;

		if (human == 13) {

			dog = 1;
			return dog;

		} else if (human > 13) {

			human = human - 13;

			dog = 1;

			double temp = (human / 16) * 3;

			double ret = (double) Math.round(temp);

			dog = dog + ret;
			return dog;
		} else {

			dog = 0;
			return dog;

		}

	}

	public static void main(String[] args) {
		// TAKE IN USER INPUT
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter number");
		int dog = keyboard.nextInt();

		DogYears converter = new DogYears();
		double human = converter.convertToDogYears(dog);

		// PRINT OUT THE RESULT
		System.out.println(human);
	}

}