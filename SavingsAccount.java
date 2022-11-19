
public class SavingsAccount extends BankAccount {
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	public void postInterest() {
		double interestPerMonth = (rate/12);
		super.deposit(interestPerMonth * super.getBalance());
		
	}
	
	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public SavingsAccount(SavingsAccount originalSavingsAccount, double initialBalance) {
		super(originalSavingsAccount, initialBalance);
		++this.savingsNumber;
		this.accountNumber =super.getAccountNumber()+ "-" + this.savingsNumber;
		
	}
	

}
