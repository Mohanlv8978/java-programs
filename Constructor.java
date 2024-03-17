package project_1;

public class Constructor {
	int id;
	String name;
	public Constructor(int i){//Constructor one can store integer
		this.id= i;
		System.out.println("c1 id is:"+i);
		
	}
	public Constructor(String n)//Constructor two can store only stringer
	{
		this.name=n;
		System.out.println("c2 name is:"+n);
	}
	public Constructor(int i,String n) {//Constructor 3 accepting both string and integer
		this.id=i;
		this.name=n;
	}
	void display() {//printing 
		System.out.println("id is:"+id+"name is:"+name);
	}
	public static void main(String[] args) {
		Constructor obj1 = new Constructor(46,"mohan");
		obj1.display();
	}
}
