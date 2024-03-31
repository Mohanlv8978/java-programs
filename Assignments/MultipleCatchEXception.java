import java.util.Scanner;

public class MultipleCatchEXception {

	public static void main(String[] args)  
	{
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		int a[]= {1,2,3};
try {
	 input =a[input]/0;
	}
catch(ArrayIndexOutOfBoundsException e1) 
	{
	System.out.println(e1.getMessage());
	}
catch(ArithmeticException e2) 
	{
	System.out.println(e2.getMessage());
	}
System.out.println("End");
}
}
