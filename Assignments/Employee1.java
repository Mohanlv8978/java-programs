import java.util.*;
public class Employee1 {
	int salary;
	int hours;
	
public void getInfo(int salary,int hours) 
{
	this.salary=salary;
	this.hours=hours;
}
void AddSal(){
	if(this.salary < 5000) {
	this.salary +=1000;
		System.out.println("1000 is bouns is add to ur account: "+this.salary);
	}
	else {
		System.out.println("No bonus added to your salary");
	}
}
	void AddWork(){
	if(this.hours > 6) {
		this.salary += 500;
	
		System.out.println("you worked more then 6 hours:500$ is added: "+this.salary);
	}
	else {
		System.out.println("u working on time");
	}
}
	public static void main(String[] args) {
		
		Employee1 obj=new Employee1();
		obj.getInfo(3000,7);
		obj.AddSal();
		obj.AddWork();
	}
}