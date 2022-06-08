package curs5;

import java.util.Scanner;

public class LetterSearch {
	
	/*
	 * cerem un string de la tastatura
	 * cautam in stringul respectiv litera A
	 * daca o gasim printam "Litera A exista in text"
	 * daca nu o gasim printam "Litera A nu exitsa in text"
	 * si printam de cate ori apare
	 */
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
	System.out.println("Please enter a text: ");	
	Scanner scan =new Scanner(System.in);
	String text =scan.next().toUpperCase();
	scan.close();
	char letter='A';
	//text=text.toUpperCase();  //transforma tot textul/stringulin litera mare
	//ABBA.equalsIgnoreCase('abba'); //ignora textul din paranteza dc este cu litera mare sau mica nu conteaza
	System.out.println(text);
	
//	boolean letterFound=false;
	int counter=0;
	
	System.out.println(text.length());
	for (int i=0; i< text.length(); i++) {
		 if (text.charAt(i)==letter){
			// letterFound=true;
			 counter++;
		 }
	}
	
	if (counter>0) {
		System.out.println("Litera A exista in text de" + counter);
	}
	else{
		System.out.println("Litera A nu exista in text!");	
	}
	
	//masina
	//012345

	}

}
