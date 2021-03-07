package weekSix;

public class SavingsAccount {
    private static double intrestRate;
    private static long numberAccounts = 0;
    private long savingsAccountNumber;
    private String accountHolderName;
    private double accountBalance;
    
    //Constructor
    public SavingsAccount (String name, double balance) {
        accountHolderName = name;
        accountBalance = balance;
        numberAccounts++;
        savingsAccountNumber = numberAccounts;
        
        
    } //End Constructor
    
    //Method -- this is an annual interest rate expressed as a percentage 1.55% ect.
    public static void changeRate(double newRate) {
        intrestRate = newRate/100;
    }
    
    //Method
    public void postInterest () {
        double month = intrestRate/12;
        double calc = accountBalance +  (accountBalance * month);
        accountBalance = calc;
    }
    
    //Method
    public String toString () {
        postInterest();
        
        return accountHolderName + 
                "\t account number – " + 
                savingsAccountNumber +
                "\tcurrent balance $" +
                accountBalance + "\n";
        
    }

}
