package curs3.Homework;

public class TestCar {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1=new Car("Dacia", "V3");
		
		System.out.println(car1.carDetails());
		
		Car car2=new Car("Renault", "V1");
		car2.type="sedan";
		
		System.out.println(car2.carDetails());
		System.out.println(car1.carDetails());
	}

}
