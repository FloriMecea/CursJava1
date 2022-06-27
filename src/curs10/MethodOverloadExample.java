package curs10;

public class MethodOverloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(multiply(2,3));	
	System.out.println(multiply(3.5,4.5));
		
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static double multiply(double a, double b) {
		return a*b;
	}

}
