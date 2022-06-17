package curs7;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Intrebam userul ce calificativ a primit
		 * si in functie de calificativ printam un mesaj:
		 * A ->Felicitari!
		 * B->Destul de bine!
		 * C->Suficient!
		 * D->Insuficent
		 * dc introduce altceva printam "Nota invalida!"
		 * 
		 */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("Te rog introdu o nota:");
		String nota= scan.next();
		
		switch (nota.toUpperCase()) {
		
		case "A": 
			System.out.println("Felicitari!");
			break; //dc nu punem break dp ele si dam A afiseaza si ce este pt B, C, D si default
		case "B":
			System.out.println("Destul de bine!");
			break;
		case "C": 
			System.out.println("Suficient!");
			break;
		case "D": 
			System.out.println("Insuficent");	
			break;
		default:
			System.out.println("Nota invalida");
			//break;  - nu e neaparat nevoie caci e ultima executata si oricum iese
		
		}
				

	}

}
