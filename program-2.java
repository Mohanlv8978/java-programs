package project_1;
import java.util.*;
public class program2 {
	public static void main(String[] args)
	{		
		System.out.println("Enter a number:");
		Scanner nu= new Scanner(System.in);
		 int i = nu.nextInt(); 	 
		 if(i<=7){
			 for (int n=i;n<=7;n++)	
			System.out.println(n);
		 }
		 else{
			 System.out.println("Enter less than 7");
		 }
		 nu.close();
	}
	}