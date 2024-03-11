package project_1;
import java.util.*;
public class matrix {
	public static void main(String[] args) {
		int a[][]= new int [][] {{1,2},{3,4}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				sum = sum+a[i][j];
				}
			}
			System.out.println(sum);
		}
	}