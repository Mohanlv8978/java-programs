package project_1;
import java.util.*;
public class arrysorting 
{
	public static void main(String[] args) 
	{
		int a[]={8,6,7,2,4,1};
		Arrays.sort(a);
				for(int i = 0; i<a.length;i++)
				{
					System.out.println("Array after sorting:"+a[i]);///sorting
				}
				System.out.println("Enter a number to find index value");
				Scanner sc = new Scanner(System.in);///take input from user to find index value after sorting 
				int b = sc.nextInt();
				int c = Arrays.binarySearch(a,b);
				System.out.println("index:"+c);
				int e[]= {1,8,9,11,2,6};
				if(a == e) ///Comparing 2 Arrays
				{
					System.out.println("Array is equal");
				}
				else 
				{
					System.out.println("Array is not equal");
				}
	}
}
