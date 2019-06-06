public class Diploma
{
  private String name;
  private String course;
  
  public Diploma(String n, String c)
  {
    name = n;
    course = c;
  }
  
  
  public String toString()
  {
    String str = "This certifies that " + name + " \n has completed a course in " + course;
    return str;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
