package project_1;
import java.util.*;
public class Bank1
{
	long balance;
	long withdraw;
	long diposit;
	public Bank1()
	{
		this.balance=balance;
		balance=1000;
		System.out.println("Your Balance is: "+this.balance);
	}
	void method1()
	{
		System.out.println("Enter Diposit Amout");
		Scanner sc= new Scanner(System.in);
		long x=sc.nextLong();
		this.diposit=x;
		System.out.println("Amount Diposited successfuly:");
		this.balance = x+balance;	
		System.out.println("Your balance is "+ this.balance);
	}
	void method2() {
	    System.out.println("Enter withdraw amount:");
	    Scanner sc = new Scanner(System.in);
	    int withdrawAmount = sc.nextInt();
	    if (withdrawAmount > this.balance) 
	    {
	        System.out.println("Insufficient funds. Your balance is: " + this.balance);
	    } 
	    else 
	    {
	        this.withdraw = withdrawAmount;
	        System.out.println("Your withdraw is successful.");
	        balance = this.balance - withdrawAmount;
	        System.out.println("Your balance is: " + this.balance);
	    }
	    sc.close();
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