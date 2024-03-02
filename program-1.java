package project_1;
import java.util.*; 
public class scanner {
	void method1() //scanner->take input from user and print
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String o = sc.nextLine();
		System.out.println("your name is:"+ o);
	}
	void method2()//check if given number is lesser then 10 or not 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int o = sc.nextInt();
	{
	if(o<9)
	{
		System.out.println(o +" is less then 10");
	}
	else
	{
		System.out.println(o +" greater then 9");
	}
	}
	}
	public static void main(String args[]) 
	{
	scanner obj = new scanner();
	obj.method1();
	obj.method2();
	}
}