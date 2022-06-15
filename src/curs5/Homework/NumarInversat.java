package curs5.Homework;

import java.util.Scanner;

public class NumarInversat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please enter a number");
		Scanner scan= new Scanner(System.in);
		String number=scan.next();
		
		//sau citim int si dp trasnformam in string
	//	System.out.println("Please enter a number");
	//	Scanner scan1= new Scanner(System.in);
	//	int number1=scan1.nextInt();
		
	//	String.valueOf(number1);
	//	String a = ""+number1;
		
		
		int i= number.length()-1;
		
		while (i>=0) {
			System.out.print(number.charAt(i));
			i--;
			
		} 		
		


	}

}
