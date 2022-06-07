package curs3.Homework;

public class Car {

	public static  String brand;
	public static  String type;
	public static  String engine;
	
	public Car(String brand, String engine) {
		this.brand=brand;
		this.engine=engine;
		this.type="suv";
		
	}
	public static String carDetails() {
		String return_value;
		
		return_value= "All " + brand+ " cars are "+ engine + " and are of type " + type;
		
		return return_value;
	}

	public static void main(String[] args) {
		//am adaugat eu chestii in plus aici sa pricep mai bine, nu aveam nevoie de main aici
		//System.out.println(carDetails());
		//Car car2= new Car("bmw", "v2");
		//System.out.println(carDetails());
		
		System.out.println(carDetails());
		brand="bmw";
		engine="v2";
		type="seria 4";			
		System.out.println(carDetails());
		Car car2= new Car("renault", "v1");
		System.out.println(carDetails());
	}

}
