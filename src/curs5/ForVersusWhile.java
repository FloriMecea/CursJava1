package curs5;

import java.util.Scanner;

public class ForVersusWhile {

	/*
	 * Facem un program care ii cere utilizatorului numere pe care le aduna
	 * userul introduce cate numere doreste
	 * camd doreste sa se opreasca va introduce 0
	 * 
	 */
	
	
	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		rezolvareCuFor();
		Thread.sleep(2000);
		rezolvareCuWhile();

	}
	
	
	
	public static void rezolvareCuFor() {
		System.out.println("Please enter a number");
		Scanner scan= new Scanner(System.in);
		
		int sum=0;
		for (int x=scan.nextInt(); x!=0; x=scan.nextInt()) {
			System.out.println(x);
			sum+=x;
			System.out.println("Please enter a number");
			
		}
		System.out.println("Suma totala este:" + sum);
		//scan.close(); -trebuie scos close de aici ca sa mearga- altfel se incurca cu celalalt scanner
		
	}
	
	public static void rezolvareCuWhile() {
		int sum=0;
		System.out.println("Please enter a number");
		Scanner scan= new Scanner(System.in);
		int number=scan.nextInt();
		
		while (number !=0) {
			System.out.println(number);
			sum+=number;
			System.out.println("Please enter a number");
			number=scan.nextInt();
		}
		System.out.println("Suma totala este:" + sum);
		scan.close();
		
	}

}
