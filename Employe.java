import java.util.*;
public class Employe{
	String name;
	int year_of_joining;
	double salary;
	String address;
 public Employe(String name,int year_of_joining,double salary,String address) 
	{
		this.name=name;
		this.year_of_joining= year_of_joining;
		this.salary=salary;
		this.address=address;
	}
	void diplay() {
		System.out.println(name+" "+year_of_joining+" "+salary+" "+address);
	}
	public static void main(String[] args) {
		Employe obj=new Employe("Ramesh",1994,37500.75,"64C- James Street ");
		Employe obj2=new Employe("Ssandeep",2000,42750.85,"68D- Bank Street" );
		Employe obj3=new Employe("Sandhya",1999,38785.25,"26B- Temple Lane" );
		obj.diplay();
		obj2.diplay();
		obj3.diplay();
	}
}
