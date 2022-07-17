package curs11.Homework;

public class TestClass {

	public static void main(String[] args) {
		Human obj1=new Human();
		Monkey obj2= new Monkey();
		
		System.out.println("Primate datatype instance of Human");
		System.out.println("----------------------------------");
		obj1.walk();
		obj1.run();
		System.out.println(obj1.eat()); 
		obj1.speak();
		obj1.sleep();
		System.out.println();
		
		
		System.out.println("Primate datatype instance of Monkey");
		System.out.println("----------------------------------");
		obj2.walk();
		obj2.run();
		obj2.sleep();
		System.out.println(obj2.eat()); 
		obj2.speak();
	}

}
