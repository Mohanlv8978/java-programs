import java.util.Scanner;
public class BankException {
int amount=1000;
public static class insufficientfundException extends Exception
{
	public insufficientfundException() 
	{
		super("amount is grater then balance");
	}
}
public void Diposit() {
	System.out.println("Enter Diposit Amount");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	this.amount +=x;
	System.out.println("Diposit Successfull");
	sc.close();
}
public void withdraw() throws insufficientfundException {
	System.out.println("Enter Withdraw Amount:");
	Scanner cs=new Scanner(System.in);
	int y=cs.nextInt();
	try {
		if(y>this.amount) 
		{
		throw new insufficientfundException ();
		}
		else 
		{
			this.amount -=y;
			System.out.println("withdraw successfull");
		}	
	}
	catch(insufficientfundException e) 
	{
		System.out.println(e.getMessage());
	}
	finally {
		cs.close();
	}
}
public void BalanceCheck() {
	System.out.println("Your balance is"+ this.amount);
}
	public static void main(String[] args)
	{
		BankException obj = new BankException();
		obj.Diposit();
		try
		{
			obj.withdraw();
		}
		catch(insufficientfundException e) 
		{
			System.out.println(e.getMessage());
		}
		obj.BalanceCheck();
	}		
}
