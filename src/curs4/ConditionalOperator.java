package curs4;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
    //citeste 2 numere d ela tatstatura
		//verifica daca fiecare numar este pozitiv
		//verifica dc ambele numere sunt pozitive
		//verifica care dintre cele 2 numere este mai mic
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter first number : ");
		num1=scan.nextInt();
		System.out.println("Please enter second number : ");
		num2=scan.nextInt();
		scan.close();
		
		//verifica dc num1 este pozitiv
		if (num1>0) {
			System.out.println("Num1 is pozitive ");
			
		}
		else 
		{
			System.out.println("Num1 is negative ");
		}
		
		
		//verifica dc num2 este pozitiv
		if (num2>0) {
			System.out.println("Num2 is pozitive ");
			
		}
		else 
		{
			System.out.println("Num2 is negative ");
		}
		
		//verifica dc ambele numere sunt pozitive
		if ((num1>0) && (num2>0)) {
			System.out.println("Both numbers are pozitive ");
			
		}
		else {
			System.out.println("At least one number is negative ");
		}
		
		if (num1>num2) {
			System.out.println("Num2 is the smallest ");
		}
		else
			if (num1 == num2){
				System.out.println("Both are equal ");
			}
			else
				System.out.println("Num1 is the smallest "); 
		
	
	System.out.println("New way of calculate"); 
	
	String result ;
	result = num1>0 ? "Num1 is positive" : "Num1 is negative";
	System.out.println(result); 
	result = num2>0 ? "Num2 is positive" : "Num2 is negative";
	System.out.println(result); 
	result = (num1>0) && (num2>0) ? "Num1 and Num2 are  positive" : "Num1 and Num2 are negative";
	System.out.println(result); 
	result = (num1==num2) ? "numbers are equal" : (num1<num2? "Num1 is the smallest" : "num2 is the smallest");
	System.out.println(result); 
	

}
}
