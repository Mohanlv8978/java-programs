import java.util.Scanner;
import java.util.*;
public class Person {
    public String name;
    public int age;
public Person(String name,int age){
	this.name=name;
	this.age=age;
}
void Display() {
	System.out.println("Name is: "+name);
	System.out.println("Age is: "+age);
}
	public static void main(String[] args) {
		System.out.println("Enter the name: ");
		Scanner sc= new Scanner(System.in);
		String inputName=sc.nextLine();
		System.out.println("Enter the Age: ");
		Scanner sc1= new Scanner(System.in);
		int inputint=sc1.nextInt();
		Person obj=new Person(inputName,inputint);
		obj.Display();
	}
}
