package curs11;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Product produs = new Product(); - nu se poate crea obiect din parinte dc este o clasa abstracta
		//pt ca exista metoda neimplementata
		
		Laptop laptop= new Laptop(300,19,200);
		System.out.println(laptop.calculatePrice());
		laptop.printProductiRating();
		
		Mobile mobile= new Mobile(120,4);
		System.out.println(mobile.calculatePrice());
		mobile.printProductiRating();
	}

}
