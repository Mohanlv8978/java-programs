import java.util.Scanner;
import java.util.*;
public class TrafficLight {
	public String color;
	public int duration;	
public TrafficLight(String color) {
		this.color=color.toLowerCase();
	}
public void check2()
{ 
	if("red".equals(color)) 
	{
		duration= 5;
		System.out.println("Duration  for Red is:"+duration);
	}
	else if("green".equals(color)) 
	{
		duration= 4;
			System.out.println("Duration  for green is:"+duration);
	}
	else 
	{
		System.out.print("invalid");
	}
		
}
	public static void main(String[] args) {
		System.out.println("Enter color");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		TrafficLight obj=new TrafficLight(input);
		 obj.check2();
	}
}