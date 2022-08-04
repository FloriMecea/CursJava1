package curs18;


//Varargs =argumete variabile: pot sa fie numar variabil de argumente/parametrii pt o metoda
//aceasi metoda poate fi apelata cu numar diferit de variabile/argumente
public class VarargsExample {

	public static void main(String[] args) {
		printArguments("1","2","3");
		printArguments("1","2","3","4");
		printArguments("7","8");
		printArguments("1","2","3","4","9","10");
	
		
		printArguments2(123, false, "1", "2", "3", "4");
		printArguments2(88, true, "1", "2");
		
		
		printArguments3('c', 123, 350.6, false);
		printArguments3("Text", true, 350.6, false, 44);
		printArguments3("2", "true","c", 100.50);
	}
	
	public static void printArguments(String...values) {
		for (String value: values) {
		  System.out.println(value);
	    }
	}
	
	
	public static <T> void printArguments3(T...values) {
		for (T value: values) {
		  System.out.println(value);
	    }
	}
	
	public static void printArguments2(int num ,boolean conditie, String...values) {
		
		for(String value : values) {
			System.out.println(value);
		}
		
	}
	
	//lista de argumente variabile poate sa fie o singura data ca parametru si trebuie sa fie ultima ca parametru din lista de parametrii
/*	public static void printArguments(int num, boolean conditie, String...values) {
		for (String value: values) {
		  System.out.println(value);
	    }
	}

	public static void printArguments(String str1, String str2, String str3) {
		System.out.println(str1 +" " +str2 +" "+str3);
	}
	
	public static void printArguments(String str1, String str2, String str3, String str4) {
		System.out.println(str1 +" " +str2 +" "+str3+" "+str4);
	}
	*/
}
