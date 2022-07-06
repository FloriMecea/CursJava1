package curs12.package3;

public class Exception3 {

	public static void main(String[] args) {


		try {
			String name="null";
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("Null pointer occured!");
		} finally {  //finaly se executa indiferent dc prinde sau nu eroare cu catch din try
			//doar dc dam system exit sau facem o exceptie sa crape si in finaly
			//in finaly de exemplu fac restore la datele setate in db anterior
			//System.out.println(3/0);
			System.out.println("Finaly block of code");
		}
		
		System.out.println("Code after try catch");

	}

}
