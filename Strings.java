package project_1;
import java.util.*;
public class Strings {
	public static void main(String[] args) {
		String s1="hello ";
		String s2="World ";
		String s5="java";
		String s3=s1.substring(0).toUpperCase();
		String s4=s2.substring(0).toLowerCase();
		String s6=s5.replace('j','*');
		System.out.print(s3 + s4+s6);
	}
}
