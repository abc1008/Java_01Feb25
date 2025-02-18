package test;

public class CarLoan extends Loan
{
	
	public void calculateCarLoanInterest()
	{
//		Loan loan = new Loan();
		
		calcualteInterest();
	}
	
	
	public static void main(String[] args)
	{
		CarLoan cl = new CarLoan();
		cl.calculateCarLoanInterest();
	}

}
