package project_1;
import java.util.*;
public class duplicatevalue
{
	public static void main(String[] args) 
	{
		int[] a= {1,46,18,16,16,46,18};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j])
				System.out.println("duplicate values are"+a[j]);
			}	
		}
	}
}