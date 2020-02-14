package wright_problem2;

public class SavingsAccount {

static double annualInterestRate;
private double savingsBalance;
	
	SavingsAccount(double sb){
		savingsBalance = sb;
	}
	public double calculateMonthlyInterest() {
		double monthlyInterest;
		monthlyInterest = (savingsBalance * annualInterestRate)/12;
		return savingsBalance += monthlyInterest;
		
	}
	
	public static void modifyInterestRate(double rate) {
		annualInterestRate = rate;
	}
	
}
