package curs7;

import java.util.Scanner;

public class CheckCharIsVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 /*
	  * Cerem o litera de la tastatura si vedem dc este vocala sau consoana	
	  */
		
		System.out.println("Introdu o litera:");
		Scanner scan= new Scanner(System.in);
		char ch= scan.next().charAt(0);
		
		switch (ch) {
		// if (ch=='a' || ch=='e' || ...ch='u'
		
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o':
		case 'u': 
		case 'A': 
		case 'E': 
		case 'I': 
		case 'O':
		case 'U': System.out.println("Este vocala");
		break;
		default:
			System.out.println("Nu este vocala");
		}
	}

}
