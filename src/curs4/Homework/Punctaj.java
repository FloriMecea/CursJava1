package curs4.Homework;

import java.util.Scanner;

public class Punctaj {

	int puncte;

	public void citestePunctaj() {

		System.out.println("Introduce punctajul: ");
		Scanner scan = new Scanner(System.in);
		puncte = scan.nextInt();
		scan.close();

	}

	public String calculeazaCalificativ(int punctaj) {
		String calificativ = "";

//		calificativ= (puncte>)

		if (punctaj >= 90) {
			calificativ = "FB";
		} else if (punctaj >= 80) {
			calificativ = "B";
		} else if ((punctaj < 80)&& (punctaj>0)) {
			calificativ = "S";
		} else System.out.println("Punctajul nu poate fi mai mic de 0");
	
		return calificativ;
	}

	public void afiseazaMesaj(String calificativ) {
		
		if (calificativ == "FB") {
			System.out.println("Ai primt: FoarteBine");
		} else if (calificativ == "B") {
			System.out.println("Ai primt: Bine");
		} else if (calificativ == "S") { 
			System.out.println("Ai primit: Suficient");
		}
	
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Punctaj punctaj1= new Punctaj();
		// intreaba utilizatorul un punctaj
		punctaj1.citestePunctaj();
		// compara si calculam calificativ
		 String rezultat=punctaj1.calculeazaCalificativ(punctaj1.puncte);
		// printam mesaj in functie de calificativ
       // punctaj1.afiseazaMesaj(punctaj1.calculeazaCalificativ(punctaj1.puncte));
         punctaj1.afiseazaMesaj(rezultat);

	}

}
