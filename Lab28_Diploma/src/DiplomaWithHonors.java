
public class DiplomaWithHonors extends Diploma {
public String name;
public String subject;
	public DiplomaWithHonors(String Name, String Subject) {
		super(Name, Subject);
	}

	public String toString() {
		return super.toString() + "\n *** with honors ***";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
