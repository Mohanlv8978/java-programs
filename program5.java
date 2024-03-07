package project_1;
import java.util.Scanner;
public class program5 {
	int id;
	String name;
	String course;
	public static void main(String[] args) {
		program5 obj1 = new program5();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter name");	
	String name1 =sc.nextLine();
	obj1.name=name1;
	Scanner sc2 = new Scanner(System.in);
	System.out.println("enter Id");
	int id1 = sc2.nextInt(); 
	  obj1.id=id1;
	  Scanner sc3 = new Scanner(System.in);
	  System.out.println("enter course");
	  String name2 = sc3.nextLine();
	  obj1.course = name2;
	  System.out.println(obj1.name+" "+obj1.id+" "+obj1.course);
	}

}
