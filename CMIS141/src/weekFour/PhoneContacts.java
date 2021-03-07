package weekFour;

public class PhoneContacts {
	// Fields. 
	private String firstName;
	private String lastName;
	private int phoneNumber;
	// Constructor.
	public PhoneContacts (String first,
							String last,
							int phone) {
		firstName = first;
		lastName = last;
		phoneNumber = phone;
		}// Close Constructor
	
	//Getter Methods.
	public String getName() {
		return lastName +", " + firstName;
		}// Close getter getName.
	
	public String getPhoneNumber() {
		String newString ="";
	String phoneNumberString = String.valueOf(phoneNumber);
	for( int i = 0; i < phoneNumberString.length(); i++) {
		newString += phoneNumberString.charAt(i);
		if( (i ==2)||(i == 5)) {
			newString += "-";
			}//close if
		}// close for
	return newString;
	}
	
} // Close PhoneContacts.
