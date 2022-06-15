package curs5.Homework;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean is_palindrom=false;
		System.out.println("Please enter a number/text or what you want to be checked as beeing a palindrom or not");
		Scanner scan= new Scanner(System.in);
		String info=scan.next();
		
		String character1="", character2="";
		
		for (int i=0; i<info.length(); i++) {
	
			character1= character1+ info.charAt(i);
			character2 =character2 +info.charAt(info.length()-1-i);
    
		if (i==info.length()-1)	 {
			
			if (character1.equals(character2)) {
				is_palindrom=true;
				
				System.out.println("Palindrom");
			}
			else 
				System.out.println("Nu este palindrom");
		}
		
	}

   }
	
}
