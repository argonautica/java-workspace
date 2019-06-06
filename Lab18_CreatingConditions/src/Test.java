
public class Test {
public static boolean isLeapYear(int year) {
	
	if (year % 4 ==0) {
	if ((year %100 == 0 && year%400 == 0)) {
		
		return true;
	}
	else {
		return true;
	}
	
	}
	return false;

	
	
}
	
	
	public static void main(String[] args) {
System.out.println(isLeapYear(2012));
	}

}
