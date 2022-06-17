package curs7;

import java.util.Scanner;

public class SwitchExample2 {
	/*
	 * facem un program care verifica dc un student are dreptul la bursa de studii
	 * conditiile sunt:
	 * sa fie anul 3
	 * sa aiba un punctaj de 80 pt bursa1 
	 * sa aiba un punctaj de 50 pt bursa2
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		
		System.out.println("Te rog introdu in ce an esti:");
		Scanner scan= new Scanner(System.in);
		int an=scan.nextInt();
		
	//	System.out.println("Te rog introdu punctajul:");
	//	int punctaj=scan.nextInt();
		
		switch (an) {
		
		case 1: 
		case 2: 
			System.out.println("Nu esti eligibil pt bursa");
			break;
		case 3:
		   System.out.println("Te rog introdu punctajul:");
		   int punctaj=scan.nextInt();
		   switch(punctaj) {
		     case 50: 
		    	 System.out.println("Esti eligibil pt bursa2");
		    	 break;
		     case 80: 
		    	 System.out.println("Esti eligibil pt bursa1");
		    	 break;  
		     default:
		    	 System.out.println("Te rog introdu doar o valoare valida");
		   }
		 break;
		 default: 
			 System.out.println("Te rog introdu doar o valoare valida");
		}

	}

}
