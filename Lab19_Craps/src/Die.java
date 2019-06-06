
public class Die {
static int dots;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getNumDots());
	}
	public static void roll() {
	
		
	 dots = (int)(6* Math.random() + 1)	;
		
		
		
	}
	
	public static int getNumDots() {
roll();
return dots;		
	}

}
