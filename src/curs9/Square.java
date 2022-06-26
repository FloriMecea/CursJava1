package curs9;

public class Square extends Shape {
	public String shapeName="Patrat";
	public String shapeColor="Negru";
	
	
	
	public void displayDetails() {
		
		System.out.println("CLASA COPIL -Shape name is: "+super.shapeName+ " and the color is: " +shapeColor);
	    super.displayDetails();
	}
	
	//super in fata afiseaza din parinte si nu de aici

}
