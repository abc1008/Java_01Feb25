package encapsulation_discussion;

public class ATM_Room
{

	
	
	public static void main(String[] args)
	{
		Bank_Acc c1 = new Bank_Acc();
		
//		System.out.println(c1.account_bal);
		
		 int myBalance = c1.getBalance();
		
		 System.out.println(myBalance);
		
		
	}
	
	
	
	
}
