import javax.swing.JOptionPane;

public class AgeChecker {
	//asks user for input//
	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog(null, "What is your first name?");
		String lastName = JOptionPane.showInputDialog(null, "What is your last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null,"What year were you born?"));
	//verify and concatenate ages/names
		boolean oldEnough = verifyLegalAge(yearOfBirth);
		String fullName = concatenateNames(firstName, lastName);
	//outputs string depending on the result
		if(oldEnough == true) {
			JOptionPane.showMessageDialog(null, fullName + ", you may proceed with your shopping:");
		} else {
			JOptionPane.showMessageDialog(null, fullName + ", you're not old enough, try disney.com instead!");
		}

	}
	//takes an int and returns a boolean value if 19 or over//
	public static boolean verifyLegalAge(int yob) {
		boolean legalAgeStatus = (2013-yob) >= 19;
		return legalAgeStatus;
	}
	//uses two string and makes one//
	public static String concatenateNames(String fn, String ln) {
		String fullName = fn + " " + ln;
		return fullName;
	}
}





