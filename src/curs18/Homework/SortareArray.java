package curs18.Homework;

import java.util.Arrays;

public class SortareArray {

	
	public static void main(String[] args) {
		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
		Integer[] intArray = {100, 500, 300, 400, 200};
		Character[] charArray = {'a', 'b', 'd', 'c' };
		
	    System.out.println("--------------------Sortare string-------------------------");
		sortare(textArray, textArray.length);
		System.out.println("--------------------Sortare integer-------------------------");
		sortare(intArray,intArray.length);
		System.out.println("--------------------Sortare char-------------------------");
		sortare(charArray, charArray.length);

	

	}
	
	public static <T extends Comparable> void sortare( T[] obj, int lungime){
		T aux;	
		 
		 for (int i=0;i<=lungime-1;i++) { 
			  for (int j=i+1;j<=lungime-1;j++) {
				 if (obj[i].compareTo(obj[j])>0){ 
					 aux=obj[i];
					 obj[i]=obj[j];
					 obj[j]=aux;					
				 }
			 }
		 }
		 for (T element: obj) {
			 System.out.println(element);
		 }
		 

	}
}
	
