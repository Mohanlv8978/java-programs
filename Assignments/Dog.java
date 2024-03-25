
public class Dog {
String name;
String breed;
public Dog(String name,String breed) {
	this.name=name;
	this.breed=breed;
}
public String method1() {
	return name;	
}
public String method2() {
	return breed;
}
	public static void main(String[] args) {
		Dog obj1=new Dog("pinky","Golden Retriever");
		System.out.println("Dog name is:"+obj1.method1()+"  "+"breed is:"+obj1.method2());
		Dog obj2=new Dog("honey","idk");
		System.out.println("Dog name is:"+obj2.method1()+"  "+"breed is:"+obj2.method2());	
	}
}