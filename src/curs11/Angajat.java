package curs11;

public interface Angajat {
	//oblig ca orice obiect ce implementeaza Angajat sa isi implementeze tot ce este
	//in interiorul interfetei
	
	//interfata este o clasa cu toate metodele goale/neimplementate
	//si care nu are decat constante
	
	//public int number; - te obliga sa faci constanta si nu te lasa sa decalri variabila de clasa normala
	public static final int number = 0;
	

	
	void setName(String name);
	String getName();
	
	void setEmail(String email);
	String getEmail();
	
	
	//dc cumva vrei sa implementezi vreo metoda ii pui default in fata
	//pt astea cu default nu te obliga in copii sa adaugi implementarea si pt metoda asta
	default void printNumeDepartament() {
		System.out.println("QA");
	}
	
	


}
