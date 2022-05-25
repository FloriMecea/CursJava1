package curs1;

public class FirstJavaClass {
	
	// ---> one line comment
	/*
	 *  ---> multiple line comment
	 */

	//variabila
	String nume="Jhonny";
	//string data type-ul
	//nume -numele ales de user pt variabila
	//Johny 
	int age=23;
	//String  ---> reprezinta data typul variabilei
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstJavaClass obiect = new FirstJavaClass(); //instantierea unei clase in java
		obiect.grettings(); //callul metodei -am chemat metoda
	}

	
	//metoda
	public void grettings () {
		System.out.println("Hello " + nume);
	}
	
}
