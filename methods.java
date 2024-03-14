package project_1;
import java.util.*;
public class methods {
	Scanner sc=new Scanner(System.in);
	String name;
	int id;
	long salary1;
public void employe(){
	this.name=name;
	this.id=id;
	System.out.println("Enter name ");
	name =sc.nextLine();
	System.out.println("Enter id ");
	id=sc.nextInt();
	System.out.println("Name: "+ name);
	System.out.println("Id:"+id);
}
public long getsalary() {
	this.salary1=salary1;
	 Scanner sc = new Scanner(System.in); 
	System.out.println("enter salary:");
	long x =sc.nextLong();
	System.out.println("salary: "+ x);
	return salary1;
}
public void display() {
	employe();
	getsalary();	
	}
	public static void main(String[] args) {
		methods obj= new methods();
		obj.display();
	}
}