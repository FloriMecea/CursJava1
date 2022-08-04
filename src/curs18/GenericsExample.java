package curs18;


//generics inseamna ca putem da mai multe tipuri de date ca parametru printr-un singur T
public class GenericsExample {

	public static void main(String[] args) {
	/*	printDetails("Text");
		printDetails(123);
		printDetails(250.66);
		printDetails(true);
	*/	
		printDetails("Text", false);
		printDetails(123, 'c');
		printDetails(250.66, "Alt string");
		printDetails(true, 44);

	}
	
	
	//in cadrul collection(set, map, list) se pune E in loc de T
	//List <String> Lista= new ArrayList<E>;
	
	
	//putem pune mai multe obj de tip generic
	//public static <T> void printDetails(T obj, T obj2 )
	//printDetails("Text", boolean);
/*	public static <T> void printDetails(T obj ) {
		System.out.println("Obiectul meu: "+ obj);
		System.out.println("Data type-ul obiectului meu:" + obj.getClass().getName());
	
	}
	*/
	
	public static <T> void printDetails(T obj, T obj2) {
		 
		System.out.println(" Obiectul meu  : " + obj);
		System.out.println(" Data type-ul obiectului meu  : " + obj.getClass().getName());

		
	}
/*	
	public static void printDetails(String text) {
		System.out.println("Obiectul meu: "+ text);
		System.out.println("Data type-ul obiectului meu:" + text.getClass());
	}
	
	//suprascriere
	public static void printDetails(Integer text) { //am dat Integer ca nu cunostea .getClass()
		System.out.println("Obiectul meu: "+ text);
		System.out.println("Data type-ul obiectului meu:" + text.getClass());
	}
*/
}
