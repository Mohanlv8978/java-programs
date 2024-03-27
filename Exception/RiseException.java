package project_1.copy;
import java.util.Scanner;
public class RiseException 
{
public void method() throws NegativeIntergerException
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<0) 
		{
		throw new NegativeIntergerException();
		}
		else 
		{
		System.out.println("postive");
		}
	}
public static class NegativeIntergerException extends Exception 
	{
		public NegativeIntergerException() 	
		{
		super("Negative integer is not allowed");
		}
	}
public static void main(String[] args) 
	{
		RiseException obj= new RiseException();
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