package weekFour;

public class CheckAge {
	// One private field to store SSN as a long.
	private int birthMonth, 
					birthDay,
					birthYear;
	
	// Constructor method
		public CheckAge (int month, 
							int day, 
							int year) {
			
			birthMonth = month;
			birthDay = day;
			birthYear = year;
		    }
		
		// Setter method
		public void setMonth(int month) {
			birthMonth = month;
		}
		
	    // Getter method
		public int getMonth() {
			return birthMonth;
		}
		public int getYear() {
			return birthYear;
		}
		public int getDay() {
			return birthDay;
		}
		// Algorithm Method
		public String Retire () {
		int aYear = 2020;
		int aMonth = 9;
		int aDay = 10;
		int bYear = aYear - getYear();
		int bMonth = aMonth - getMonth();
		int bDay = aDay - getDay();
			if (bYear > 65) {
				System.out.println("can retire");
			} else if (bYear > 64 && bMonth > 0) {
				System.out.println("can retire (month)");
			} else if (bYear > 64 && bDay >= 0) {
				System.out.println("can retire (day)");	
			} else {
				System.out.println("can't retire");
			}
			return null;

			

		}

}
