package curs6.Homework;

public class Fibonacci {
	int number=9;
	int next=0;

	
	public void calculFibCuFor() {
		
		int previous=0;
		int current=1;
		
		System.out.println("---For-----");
		System.out.println("Seria Fibonacci pentru "+ number +" numere:");
		System.out.print(previous + " " +current + " ");
		for (int i=2; i<number; i++) {
			next=previous + current;
			System.out.print(next + " ");
			previous=current;
			current=next;
			
		}
		System.out.println();
		
		
	}
	
	public void calculFibCuWhile() {
		
		int previous=0;
		int current=1;
		
		System.out.println("---For-----");
		System.out.println("Seria Fibonacci pentru "+ number +" numere:");
		System.out.print(previous + " " +current + " ");
		
		int i=2;
		while (i<number) {
			next=previous + current;
			System.out.print(next + " ");
			previous=current;
			current=next;
			i++;
			
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci nr= new Fibonacci();
		nr.calculFibCuFor();
		
		System.out.println("---While-----");
		nr.calculFibCuWhile();
		
	
	}

}
