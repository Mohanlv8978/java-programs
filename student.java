import java.util.*;
public class student {
	int sid;
	String name;
	long phn;
	static String course ="Java full stack";
	void method1(int sid,String name,long phn){//method
		this.sid=sid;
		this.name=name;
		this.phn=phn;
	}
	void display()
	{
		System.out.println(this.sid+" "+this.name+" "+this.phn+" "+course);
	}
		public static void main(String[] args) {
		student obj=new student();
		student obj2=new student();
		obj.method1(46,"mohan",897853537);
		obj.display();
		obj2.method1(16,"sirisha",735358798);
		obj2.display();
	}
}