package curs12.package3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		try {
        System.out.println("Please insert nr1:");
        int num1= scan.nextInt();
        
        System.out.println("Please insert nr2:");
        int num2= scan.nextInt();
        num2=(Integer)null;
        
        int div = num1/num2;
        System.out.println("Sum is:"+div);
		}catch (Exception e) {
			System.out.println("Something went wrong!");
		}
		
		 System.out.println("Code that I want to keep run!");
	}
	
	/*-------
	try {
        System.out.println("Please insert nr1:");
        int num1= scan.nextInt();
        
        System.out.println("Please insert nr2:");
        int num2= scan.nextInt();
        num2=(Integer)null;
        
        int div = num1/num2;
        System.out.println("Sum is:"+div);
		}catch (ArithmeticException e) {
        
         System.out.println("Please do not divide by zero!");
        // e.printStackTrace();
		}catch(InputMismatchException e) {
			System.out.println("Please insert only numeric!");
		}catch (NullPointerException e) {
			System.out.println("Null pointer occured!");
		}catch (Exception e) {
			System.out.println("Something went wrong!");
		}
*/
}
