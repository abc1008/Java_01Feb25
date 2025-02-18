package test;

public class HomeLoan extends Loan
{
	
	public void calculateHomeLoan()
	{
//		Loan loan = new Loan();
		
		calcualteInterest();
		
//		return interest
	}
	
	
	
	
	public static void main(String[] args)
	{
		HomeLoan hl = new HomeLoan();
		hl.calculateHomeLoan();
	}

}
