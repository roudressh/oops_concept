package day_1_class_and_objects;

public class Class_Creation_multiple_objects {
final int x = 5;//if we use final keyword the attributes cannot be modified
int y = 0;//multiple attributes
	public static void main(String[] args) {
		Class_Creation_multiple_objects n1 = new Class_Creation_multiple_objects();//object 1
		Class_Creation_multiple_objects n2 = new Class_Creation_multiple_objects();//object 2
		Class_Creation_multiple_objects n3 = new Class_Creation_multiple_objects();//object 3
		
		Class_Creation_multiple_objects n4 = new Class_Creation_multiple_objects();
		n4.y=25;//modifying the attributes
		System.out.println(n1.x);
		System.out.println(n2.x);
		System.out.println(n3.x);
		System.out.println(n4.y);
	}

}
