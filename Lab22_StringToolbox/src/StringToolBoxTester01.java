
public class StringToolBoxTester01 {
	/*

	 This class tests all methods of the StringToolBox class.

	 To use this, comment out all methods that you haven't finished yet. Then
	 run - you should see the output on the left and right of all lines match!

	*/

	
	public static void main(String[] args) {

		System.out.println("***Testing: boolean endsWithStar(String s)***");
		System.out.println("true = " + StringToolBox.endsWithStar("abcd*"));
		System.out.println("false = " + StringToolBox.endsWithStar(""));

		System.out.println("***Testing: boolean endsWithTwoStars(String s)***");
		System.out.println("true = " + StringToolBox.endsWithTwoStars("abcd**"));
		System.out.println("false = " + StringToolBox.endsWithTwoStars("*"));
		System.out.println("false = " + StringToolBox.endsWithTwoStars(""));

		System.out.println("***Testing: String last4(String s)***");
		System.out.println("3456 = " + StringToolBox.last4("1234 5678 9012 3456"));

		System.out.println("***Testing: String last5(String s)***");
		System.out.println("23456 = " + StringToolBox.last5("1234 5678 9012 3456"));

		System.out.println("***Testing: String scroll(String s)***");
		System.out.println("23451 = " + StringToolBox.scroll("12345"));

		System.out.println("***Testing: String convertName(String s)***");
		System.out.println("Albert Einstein = " + StringToolBox.convertName("Einstein, Albert"));

	}

}
