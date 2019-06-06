	
public class StringToolBox {

	public static String nameEcho(String s) {

		s = s.trim();
		int n = s.indexOf(" ");
		s = s.substring(0, n - 1) + s.substring(n).toUpperCase();
		return s;
	}

	public static boolean endsWithStar(String s) {
		s = s.trim();

		if (s == "") {
			return false;
		} else if ((s.charAt(s.length() - 1) == '*'))
			return true;
		else
			return false;
	}

	public static boolean endsWithTwoStars(String s) {
		// for (int i = 0; i < s.length(); i++) {
		if (s == "") {
			return false;
		} 
		
		
		else if (s.length() >=2) {
		
		 if ((s.charAt(s.length() - 2) == '*') && (s.charAt(s.length() - 1) == '*') && !(s.equals("")))
			 return true;
		 
		}
		else
			return false;
		return false;
	}

	public static String last4(String s) {

		s = s.trim();
		int len = s.lastIndexOf(" ");
		String a = s.substring(len);
		return a;

		// return "Not yet coded!";
	}

	public static String last5(String s) {

		s = s.trim();
		int len = s.lastIndexOf(" ");
		String a = s.substring(len - 1);
		a = a.replaceAll(" ", "");
		return a;

		// return "Not yet coded!";
	}

	public static String scroll(String s) {

		String a = s.substring(0, 1);
		s = s.substring(1);
		s = s + a;
		return s;

		// return "Not yet coded!";
	}

	public static String convertName(String s) {

		s = s.trim();
		s = s.replaceAll(" ", "");
		int n = s.indexOf(",");
		s = s.substring(n + 1) + " " + s.substring(0, n);

		return s;
	}

	public static String removeDashes(String s) {

		return s.trim().replaceAll("-", "");

	}

	public static String negativeBits(String s) {

		return s.replaceAll("0", "/").replaceAll("1", "0").replaceAll("/", "1");

	}
	
	public static String dateStr (String s) {
		
		s = s.substring(s.indexOf("/") + 1, s.indexOf("/", s.indexOf("/") + 1 )) + "-" + s.substring(0, s.indexOf("/") ) + "-" + s.substring(s.lastIndexOf("/") + 1).trim();
		
		return s;
		
	}

	/*public static String checkCharacters(String s) {
if s.charAt(0) != s.
		return s;

	} */
	
	public static caesar(String b){
		String a ="abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < b.length(); i++) {
			
			
			if (a.indexOf(b.charAt(i)) >=2){
				b.replace(b.charAt(i), a.charAt(a.indexOf(b.charAt(i) -2)));
			}
			if (a.indexOf(b.charAt(i)) < 2){
				b.replace(b.charAt(i), a.charAt(a.indexOf(b.charAt(i) -2)));
			}
			
		}
		
	} 
	public static boolean isPalindrome(String word) {
		String reverse = new StringBuffer(word).reverse().toString();
		if (word ==  reverse) {
			return true;
		} else return false;
	}
	
	
	
}