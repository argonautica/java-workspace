import java.util.Scanner;

public class Hangman {
	private static String[] words = { "inheritance", "abstraction", "encapsulation", "polymorphism" };

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("a");
		String word = words[(int) (Math.random() * words.length)];
		HangmanGame game = new HangmanGame(word);
		int count = 0;
		int failedGuesses = 0;

		boolean done = false;
		while (!done) {
			System.out.println("Tried: " + game.getTried());
			System.out.println("Failed guesses: " + failedGuesses);
			System.out.println(game.getGuessed());
			System.out.println();

			System.out.print("Enter next letter (or Quit): ");
			String s = input.next();// enter letter
			if ("quit".equalsIgnoreCase(s))
				break;
			if (s.length() != 1) {
				System.out.println("Invalid input");
			} else {
				int result = game.tryLetter(s.charAt(0));
				switch (result) {
				case 0:

					System.out.println("Already tried");
					break;
// if already tried
				case -1:
// if not there
					System.out.println(" not there");
					failedGuesses++;
					break;

				case 1:
// if it contains
					System.out.println("Yes!");
					break;
				}
			}

			count++;

			if (game.getGuessed().indexOf('-') == -1) {
				// number of tries
				System.out.println("You guessed " + word + " in " + count + " tries.");
				done = true;
			}
		}
	}
}
