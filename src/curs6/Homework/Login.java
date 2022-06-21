package curs6.Homework;

import java.util.Scanner;

public class Login {
	String username="";
	int password;
	Scanner scan= new Scanner(System.in);
	Scanner scan1= new Scanner(System.in);
	boolean valid=false;
	
	public void getUsername() {
		System.out.println("Enter a user: ");
		username=scan.nextLine();
		
	}
	
	public void getPassword() {
		System.out.println("Enter a password : ");
		 password=scan1.nextInt();
		//return pass;
		//return scan.nextLine();
		
	}
	
	public void checkUsernameAndPasswordRules(String username1, int pass) {
		if (username1.equals("TestUser") && (pass == 1234)) {	
	
				valid=true;
				System.out.println("Login Sucessful");
		  
		}
		
	}


	public static void main(String[] args) {
	
		Login user = new Login();
		int numberOfTries=0;
		//user.printPasswordRules();
		
		do {
		user.getUsername();
		user.getPassword ();
		user.checkUsernameAndPasswordRules(user.username, user.password);
		if (user.valid == false) {
			numberOfTries++;
			System.out.println("Login Error");
		}
		
		} while ((!user.valid)&&(numberOfTries<3));

        if (numberOfTries == 3) {
        	System.out.println("Maximum attempts reached. User blocked");
        }

	}		

}
