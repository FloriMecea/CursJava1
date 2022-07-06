package curs12.package3;

public class AgeVerifier {
 public void  checkAgeLimit(int age) throws MyAgeException {
	 if (age<18) {
		 throw new MyAgeException("Invalid age to proceed!");
	 }else {
		 System.out.println("You are allowed");
	 }
 }
}
