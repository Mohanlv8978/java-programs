package project_1;
import java.util.*;
public class arraysampleuserinput {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int a[]=new int[3];
				int sum = 0;
				
				
				for(int i =0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				
				for(int i =0;i<a.length;i++)
				{
					System.out.println(a[i]);
					sum = sum + a[i];
				}
				System.out.println("sum is " + sum);

			}
	}
