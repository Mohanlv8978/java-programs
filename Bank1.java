package project_1;
import java.util.*;
public class Bank1
{
	long balance;
	long withdraw;
	long diposit;
	public Bank1()
	{
		this.balance=balance=500;
		System.out.println("Your Balance is: "+this.balance);
	}
	
	void method1()
	{
		System.out.println("Enter Diposit Amout");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		this.diposit=x;
		System.out.println("Amount Diposited successfuly:");
		this.balance = x+balance;	
		System.out.println("Your balance is "+ this.balance);
	}
	void method2()
	{
		System.out.println("Enter withdraw amount:");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		this.withdraw=x;
		System.out.println("your withdraw is successfull: ");
		this.balance = x-balance;	
		System.out.println("Your balance is: "+ this.balance);
	 
	}
	void display()
	{
		method1();
		method2();
	}

	public static void main(String[] args) 
	{
		Bank1 obj= new Bank1();
		obj.display();
	}

}