package com.banking_pjt.banking;

import java.util.Scanner;
 class insufficientfundException extends Exception
{
	
	public insufficientfundException(String msg) 
	{
		super(msg);
	}
}
 
public class BankException {
	int amount=1000;
	
public void Deposit() 
{
	System.out.println("Enter Diposit Amount");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	this.amount +=x;
	System.out.println("Diposit Successfull");
}
public void withdraw() throws insufficientfundException {
	System.out.println("Enter Withdraw Amount:");
	Scanner cs=new Scanner(System.in);
	int y=cs.nextInt();
		if(y>this.amount) 
		{
		throw new insufficientfundException ("amount is grater then balance");
		}
		else 
		{
			this.amount -=y;
			System.out.println("withdraw successfull");
		}
	}
public void BalanceCheck() {
	System.out.println("Your balance is: "+ this.amount);
}
	public static void main(String[] args)
	{
		BankException obj = new BankException();
		obj.Deposit();
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