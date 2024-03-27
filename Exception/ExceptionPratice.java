package project_1.copy;

import java.util.Scanner;
public class ExceptionPratice 
{
public	void method() 
	{
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	
	System.out.println("divied by ");
	Scanner cs=new Scanner(System.in);
	int age1=cs.nextInt();
	long divideby=age/age1;
	System.out.println(divideby);
	}
public static void main(String[] args) 
{
		ExceptionPratice obj= new ExceptionPratice();
		try 
		{
			obj.method();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
