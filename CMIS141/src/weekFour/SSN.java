package weekFour;

public class SSN { 
	// One private field to store SSN as a long.
	private long ssnNumber;
	
	// Constructor
	public SSN (long xSsn) { 
		ssnNumber = xSsn;	
	    }
	// Setter method
	public void setSsnNumber(long xSsn) {
		ssnNumber = xSsn;
	}
    // Getter method
	public long getSsnNumber() {
		return ssnNumber;
	}

	
}