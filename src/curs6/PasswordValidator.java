package curs6;

import java.util.Scanner;

public class PasswordValidator {
	
	/*
	 * facem un program care valideaza o parola pe baza unor reguli:
	 * 1. parola trebuie sa fie de minim 10 caractere
	 * 2. parola trebuie sa contina upper case
	 * 3. parola nu trebuie sa fie la fel ca username
	 * 
	 * 
	 * intrebam utilizatorul un username si o parola
	 * il informam care sunt regulile parolei
	 * 
	 * daca parola este valida atunci printam "Parola valida"
	 * dc nu il informam care reguli nu au fost respectate si il punem sa introduca din nou
	 * 
	 * 
	 * 
	 * te rog introdu o parola care sa contina urmatoarele
	 */
	
	String username="";
	Scanner scan= new Scanner(System.in);
	boolean valid=true;
	
	
	public void getUsername() {
		System.out.println("Introdu username : ");
		username=scan.nextLine();
		
	}
	
	public String getPassword() {
		System.out.println("Introdu parola : ");
		String pass=scan.nextLine();
		return pass;
		//return scan.nextLine();
		
	}
	
	public void printPasswordRules() {
		
		System.out.println("Regulile sunt:");
		System.out.println(" 1. parola trebuie sa fie de minim 10 caractere");
		System.out.println("2. parola trebuie sa contina upper case");
		System.out.println("3. parola nu trebuie sa fie la fel ca username");
		
	}
	
	public void checkPasswordRules(String pass) {
		if (pass.length() <10) {
			valid=false;
			System.out.println(" 1. parola trebuie sa fie de minim 10 caractere");
		}
		if (pass.equals(pass.toLowerCase())) {
			valid=false;
			System.out.println("2. parola trebuie sa contina upper case");
		}
		if (pass.equals(username)) {
			valid=false;
			System.out.println("3. parola nu trebuie sa fie la fel ca username");
		}
		
	}
	
	public static void main(String[] args) {
		
		PasswordValidator user = new PasswordValidator();
		user.printPasswordRules();
		user.getUsername();
		do {
		user.checkPasswordRules(user.getPassword());
		//if (user.valid == true) {
		//	break;
		//}
		
		} while (!user.valid);

        System.out.println("Parola valida");
		
	}

}
