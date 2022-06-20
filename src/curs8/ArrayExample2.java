package curs8;

import java.util.Random;

public class ArrayExample2 {
	/*
	 * Facem un program care genereaza 6 numere intre 0-9
	 * le pune intr-un array
	 * nu pune numere duplicate
	 * printeaza array-ul
	 */

	//int [] numbers = new int[6];
	
	public final int LENGTH = 6;
	//int [] numbers= new int[LENGTH];
	
	public final int MAX_NUMBERS = 9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayExample2 obj= new ArrayExample2();
		obj.printArray(obj.generateNumbers());

	}
	
	public int[] generateNumbers() {
		int[] numbers =new int[LENGTH];
		
		Random random= new Random();
		
		for (int i=0; i<numbers.length; i++) {
			
			int randomNr=0;
			do {
				randomNr=random.nextInt(MAX_NUMBERS);
				
			} while (checkForUnicity(numbers, randomNr));
			
			numbers[i]= randomNr;
		}
		
		return numbers;
	}
	
	public void printArray(int[] array) {
		
		for (int nr: array) {  //int de Nr din array unde nr este fiecare element al array-ului
			
		   System.out.print(nr+ " | ");
		}
	}
	
	public boolean checkForUnicity(int[] array, int nr_generat) {
		
				
		for (int nr: array) {
			if (nr==nr_generat) {
				return true;  //iese din metoda cand da de primul return
			}
			
		}
		
		return false;
		
		
	}

}
