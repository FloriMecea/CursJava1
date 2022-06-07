package curs3.Homework;

import java.util.Scanner;

public class Tema2 {
	
	int varsta;
	
	//metoda introducere varsta
	public void introducereVarsta() {
		
		System.out.println("Introduce varsta");
		Scanner varsta1= new Scanner(System.in);
		varsta =varsta1.nextInt();
		varsta1.close();
	}
	
	//metoda verificare varsta
	
	public void verificareVarsta() {
		
		if (varsta <18) {
			System.out.println("Esti minor");
		}
		else
			if ((varsta >=18) && (varsta <=65)){
				System.out.println("Esti adult");
			}
			else
				 if (varsta >65) {
						System.out.println("Esti batran");
				 }
				 else
						System.out.println("Valoare incorecta a varstei");
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//apelare introducere varsta
		Tema2 obiect1= new Tema2();
		obiect1.introducereVarsta();
		
	
		//apelare verificare varsta
        obiect1.verificareVarsta();
	}

}
