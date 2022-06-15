package curs5.Homework;

import java.util.Scanner;

public class NumerePare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter first number");
		Scanner scan= new Scanner(System.in);
		int number1=scan.nextInt();
		
		
		System.out.println("Please enter second number");
		Scanner scan1= new Scanner(System.in);
		int number2=scan.nextInt();
		
		int min, max;
		
		if (number1 <= number2) {
			min=number1;
			max=number2;
		}
		else {
			min=number2;
			max=number1;
		}
		
		System.out.println("Numerele pare cuprinse intre " + min + "si "+ max +" sunt : ");
		System.out.println("Varianta cu for: ");
		for (int i=min+1; i<max;i++) {
			
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("Varianta cu while:");
		
		int j=min+1;
		while (j<max) {
			if (j%2==0) {
				System.out.println(j);
			}
			j++;
			
		}
		
		

	}

}
