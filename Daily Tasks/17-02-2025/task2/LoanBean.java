package examples;

public class LoanBean {
	private double loanAmount;
	private double loanInterest;
	private int tenure;
	
	// getters and setters 
	
	public double getloanAmount()
	{
		return loanAmount;
	}
	
	public double getloanInterest()
	{
		return loanInterest;
	}
	
	public int gettenure()
	{
		return tenure;
	}
	
	public void setloanAmount(double loanAmount)
	{
		this.loanAmount = loanAmount;
	}
	
	public void setloanInterest(double loanInterest)
	{
		this.loanInterest = loanInterest;
	}
	
	public void settenure(int tenure)
	{
		this.tenure = tenure;
	}
	
	public void displayDetails()
	{
		System.out.println("Loan Amount : " + loanAmount + "\nLoan Interest : " + loanInterest + "\nTenure : " + tenure);
	}
}
