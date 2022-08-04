package curs18;

public class StringExample {

	public static void main(String[] args) {
		transformToString();

	}
	
	//transformarea unui datatype primitiv catre un string
	public static void transformToString() {
		char ch1='a';
		char ch2='a';
		
		String str=Character.toString(ch1);
		System.out.println(str.getClass());
		
		String str2=String.valueOf(ch2);  //e bine sa folosim versiunea asta 
		//caci daca vine null poate sa il facac" null" si sa fie tot string
		System.out.println(str2.getClass());
		
		boolean bol=true;
		String str3= Boolean.toString(bol); //"true"
		String str4= String.valueOf(bol);
		
		System.out.println(str3.getClass());
		System.out.println(str4.getClass());
		
		String str5=null;
		System.out.println(str5.valueOf(str5)); //dc obiectul e null afiseaza null ca string si nu arunca exceptie
		System.out.println(str5.toString()); //arunca null pointer exception dc obiectul este null
		
		//System.out.println(str.getClass());
	}

}
