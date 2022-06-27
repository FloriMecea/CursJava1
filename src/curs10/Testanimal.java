package curs10;

public class Testanimal {

	public static void main(String[] args) {

  /*   Animal animal= new Animal();
     animal.makeSound();
		
     System.out.println("--------------");
     Lion leu= new Lion();
     leu.makeSound();
     leu.eatMeat();

     
     System.out.println("--------------");
     Deer bambi= new Deer();
     bambi.makeSound();
     bambi.eatGrass();  */
		
		
		
	     Lion simba= new Lion();  //mosteneste tot din parinte plus ale lui (copilul)
	     simba.makeSound();
	     simba.eatMeat();
	     simba.metodaAnimal();
	     
	     System.out.println("--------------");
	     
		//WebDriver driver =new FirefoxDriver();
		
		//are access la metodele comune din animal si leu + ce exista in animal (nu poate face call catre metodele copil)
		Animal leu=new Lion();
		leu.makeSound(); //call-ul metodei se face catre cea mai apropiata instanta
	//	leu.eatMeat(); - (nu poate face call catre metodele copil- doar dc fac cast- adica schimba data type-ul
		((Lion) leu).eatMeat(); //acu executa metoa eatMeat din clasa Lion doar pe linia asta: doar pe linia asta va lua data type=ul lion in loc de animal
		leu.metodaAnimal();
		feedAnimal(leu);  //poti lua decizii in functie de ce instanta este:lion sau deer
		
		 System.out.println("--------------");
		
		leu=new Deer(); // schimb instanta permanent din lion in deer, si merge doar pe cazul in care date-type-ul este parinte(Animal), dar data-typeul este acelasi: Animal 
		leu.makeSound();
		((Deer) leu).eatGrass();
		feedAnimal(leu);

	}
	
	public static void feedAnimal(Animal obiect) {
		
		if (obiect instanceof Lion) {
			System.out.println("you are getting burgers!");
		} else if (obiect instanceof Deer) {
			System.out.println("you are getting salad");
		}
	}
	
	/*
	 *HomePage
	 *ContactPage
	 *ShopCartPage
	 *ProductPage
	 *
	 * 
	 * 
	 */

}
