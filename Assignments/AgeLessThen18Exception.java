package project_1.copy;
import java.util.Scanner;
public class AgeLessThen18Exception 
{
public void method() throws NegativeIntergerException
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<18) 
		{
		throw new NegativeIntergerException();
		}
		else 
		{
		System.out.println("Age is"+input);
		}
	}
public static class NegativeIntergerException extends Exception 
	{
		public NegativeIntergerException() 	
		{
		super("Age is less then 18 not Allowed");
		}
	}
public static void main(String[] args) 
	{
		AgeLessThen18Exception obj= new AgeLessThen18Exception();
		try 
		{
			obj.method();
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}	
		System.out.println("Terinated");
	}
}