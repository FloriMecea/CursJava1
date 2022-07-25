package curs17;

public class StringBuilderExample {
	
	//dc vrem sa lucram cu acelasi obiect string folosim stringbuilder

	public static void main(String[] args) {
		String text="ceva";
		
		reverseString("Java");
		deleteFromString("Eu invat java");

	}
	
	public static void reverseString(String text) {
		StringBuilder sb= new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}

	public static void deleteFromString(String text) {
		StringBuilder sb= new StringBuilder(text);
		sb.delete(2, 6); //index de start este inclusiv, indexul de final este exlusiv-adica nu il ia in calcul
		System.out.println(sb);
	}
}
