package curs11;

public abstract class Product {//clasa abstracta trebuie sa aiba cel putin o metoda abstracta
	
	//dc vrem sa obligam pe toti copii sa aiba mandatory anumite metode
	//si copii folosesc aceasi metoda ca nume (dar corpul/body poate fi diferit)
	//restul functionalitatii unei clase abstracte ramane la fel (poti folosi variabile ca si pana acum, ca si metodele implementate)
	
	public String numeProdus;
	
	public abstract int calculatePrice();  //metoda abstracta este o metoda fara implementare
	
	

	public void printProductiRating() {
		System.out.println("I am the best product");
	}
}
