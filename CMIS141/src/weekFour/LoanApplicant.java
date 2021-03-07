package weekFour;

public class LoanApplicant { 
	// One private field to store SSN as a long.
	private String applicantName;
	private int applicantAge;
	private double loanAmt, 
					monthlySalary,
					creditDebt;
	
	
	// Constructor method
	public LoanApplicant (String name, int age, 
						double amount, 
						double salary, 
						double debt) {
		
		applicantName = name;
		applicantAge = age;
		loanAmt = amount;
		monthlySalary = salary; 
		creditDebt = debt;
	    }
	
	// Approval Method
	public boolean Approval () {
		double annualSalary = monthlySalary * 12,
				twoMonthsSalary = monthlySalary * 2;
		if (applicantAge >= 18 && 
				loanAmt < annualSalary &&
				(creditDebt < twoMonthsSalary || creditDebt < 1000)) { 
		return true;
		} else {
		return false;
		}
	}
	
	// Setter methods
	public void setname(String name) {
		applicantName = name;
	}
	public void setLoanAmt(int age) {
		applicantAge = age;
	}
	public void setLoanAmt(double amount) {
		loanAmt = amount;
	}
	public void setSalary(double salary) {
		monthlySalary = salary;
	}
	public void setDebt(double debt) {
		creditDebt = debt;
	}
	
    // Getter methods
	public String getName() {
		return applicantName;
	}
	public int getAge() {
		return applicantAge;
	}
	public double getLoanAmt() {
		return loanAmt;	
	}
	public double getSalary() {
		return monthlySalary;
	}
	public double getDebt() {
		return creditDebt;
	}


		
}