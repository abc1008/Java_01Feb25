package test;

import interface_discussion.Interface_1;

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
		
		
		System.out.println(Interface_1.num1);
		
		
		
		
	}

}
