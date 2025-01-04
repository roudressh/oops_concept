package day_1_class_and_objects;

public class Class_Multiple_class {
int x=5;


class second{
	public static void main(String[] args) {
		Class_Multiple_class n1 = new Class_Multiple_class();
		System.out.println(n1.x);

	}

}
}		
	
/*You can also create an object of a class and access it in another class. 
 * This is often used for better organization of classes 
 * (one class has all the attributes and methods,
 *  while the other class holds the main() method (code to be executed)).
 */