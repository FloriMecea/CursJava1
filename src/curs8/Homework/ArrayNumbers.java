package curs8.Homework;

import java.util.Scanner;

public class ArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= new int[10];
		int suma=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introdu 10 numere: ");
		
		for (int i=0; i<=9;i++) {
			array[i]=scan.nextInt();
			suma=suma+array[i];
		}

	   for (int number: array) {	
           System.out.print(number +" ");
	   }
	   System.out.println("-------------------------");
	   System.out.println("Suma numerelor din array este: " +suma);
	}

}
