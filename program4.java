package project_1;
public class program4 {
	public int id;
	public String name;
     static String course="mca";	
	public static void main(String[] args) {
		program4 obj = new program4();
		program4 obj2 = new program4();
		obj.id=1;
		obj.name="mohan";
		System.out.println(course);
		System.out.print(obj.id+"\n"+obj.name+"\n");
		obj2.id=2;
		obj2.name="sirisha";
		System.out.println(course);
		System.out.print(obj2.id+"\n"+obj2.name);
	}

}
