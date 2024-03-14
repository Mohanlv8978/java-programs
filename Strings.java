package project_1;
import java.util.*;
public class Strings {
	public static void main(String[] args) {
		String s1="hello ";
		String s2="WORLD ";
		String s5="java";
		String s3=s1.substring(0,1).toUpperCase();
		String s7=s1.substring(1,5);
		String s4=s2.substring(0,1).toLowerCase();
		String s8=s2.substring(1,5);
		String s6=s5.replace('j','*');
		System.out.print(s3+s7+" "+s4+s8+" "+s6);
	}
}
