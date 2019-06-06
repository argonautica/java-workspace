import java.util.Scanner;

/**
 * @(#)DogYears.java
 *
 * 
 * 					For testing purposes: Dog age of 1 = Human age 13 Dog age
 *                   of 2 = Human age 18 Dog age of 5 = Human age 34 Dog age of
 *                   8 = Human age 50 Dog age of 12 = Human age 72
 *
 * 
 * @author
 * @version
 */

public class DogYears {

	static boolean abc;

	public double convertToHumanYears(double dog) {
		double human = 0;

		human = 13;

		human = 13;
		dog = dog - 1;

		double temp = dog / 3;

		human = human + (temp * 16);

		int returnval = (int) Math.round(human);

		return returnval;
	}

	public double convertToDogYears(double human) {

		double dog;

		human = human - 13;

		dog = 1;

		double temp = (human / 16) * 3;

		double ret = (double) Math.round(temp);

		dog = dog + ret;
		return dog;

	}

	public double ConvertFtoH(double farenheit) {
		double celsius;
		celsius = Math.round(((farenheit - 32) * (0.5556)));

		return celsius;
	}

	public static void main(String[] args) {
		abc = true;
		while (abc) {
			// System.out.println());
			Scanner keyboard = new Scanner(System.in);
			System.out.println("What would you like to convert to?");
			System.out.println("Human to Dog, Dog to Human, Farenheit to Celsius");
			String text = keyboard.nextLine();

			if (text.equals("Human to Dog")) {

				System.out.println("Enter the human's age");
				int dog = keyboard.nextInt();
				DogYears converter = new DogYears();
				double human = converter.convertToDogYears(dog);

				// PRINT OUT THE RESULT
				System.out.println(dog + " is equal to " + (int) human + " in dog years");
			} else if (text.equals("Dog to Human")) {

				System.out.println("Enter the dog's age");
				double dog = keyboard.nextInt();
				DogYears converter = new DogYears();
				double a = converter.convertToHumanYears(dog);
				System.out.println(dog + " is equal to " + (int) a + " in human years");
			} else if (text.equals("Farenheit to Celsius")) {

				System.out.println("Enter the temperature in farenheit");
				double far = keyboard.nextInt();
				DogYears converter = new DogYears();
				double a = converter.ConvertFtoH(far);
				System.out.println(far + " is equal to " + a + " degrees celsius");

			} else if (text.equals("Stop")) {

				abc = false;
			}

		}

	}

}