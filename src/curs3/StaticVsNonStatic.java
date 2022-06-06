package curs3;

public class StaticVsNonStatic {


	public static String nume;
	
	public static String departament = "QA";
	
	
	public static void main(String[] args) {

	//obiect1
		nume = "Oana";
		System.out.println(nume);
		
		StaticVsNonStatic person1 = new StaticVsNonStatic();
		person1.nume = "Johnny ";
		System.out.println(person1.nume + departament);
	//obiect2
		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person2.nume = "Bravo ";
		System.out.println(person2.nume + departament);
	//obiect3
		StaticVsNonStatic person3 = new StaticVsNonStatic();
		person3.nume = "Trei ";
		departament = "Dev";
		System.out.println(person3.nume + departament);
		
	System.out.println("------------------------------------");
		System.out.println(person1.nume + departament);
		System.out.println(person2.nume + departament);
		System.out.println(person3.nume + departament);


		
	}

}
