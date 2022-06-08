package curs5;

import java.util.Scanner;

public class WhileLoopExample2 {

	/*
	 * Facem un program care calculeaza salariu pe o saptamana
	 * Intrebam userul cate ore a lucrat
	 * calculam doar dc numarul de ore este intre 1 si 40
	 * daca nr de ore este invalid il rugam sa mai introduca o data pana introduce un numar valid
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ratePerHour=15;
		int maxHours=40;
		
		System.out.println("Cate ore ai lucrat saptamana aceasta? :");
		Scanner scan=new Scanner(System.in);
		int hoursWorked=scan.nextInt();
		
		while (hoursWorked<1 || hoursWorked>maxHours) {
			System.out.println("Numar invalid de ore!");
			System.out.println("Te rog introdu un numar intre 1 si 40");
			hoursWorked= scan.nextInt();
		}
		
		System.out.println("Salariu de platit este:" + hoursWorked*ratePerHour);

	}

}
