package curs18;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicateWord {
	/**
	 * 
	 * 	Avem urmatorul string : “Lorem ipsum dolor sit amet, consectetur
adipiscing elit. Aliquam consectetur odio ac quam commodo, eu
eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,
vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius
malesuada. Nulla neque lacus, euismod quis erat nec, convallis
vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat.
Nulla elementum urna in dolor viverra, in efficitur lectus mattis.”
u 


Vom face 4 metode :

1. Prima metoda va verifica de catre ori apare cuvantul “Nulla” in
acest string si va printa numarul
	*/

	
	public static String text= "Lorem ipsum dolor sit amet, consectetur "
			+ "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu "
			+ "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, "
			+ "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius "
			+ "malesuada. Nulla neque lacus, euismod quis erat nec, convallis "
			+ "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. "
			+ "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
	
			
	public static void main(String[] args) {
		countMethod1();
		countMethod2();
	}
	
	public static void countMethod1() {
		String[] array=text.split(" "); //imi va popula arrayul cu cuvintele din string (cuvinte separate prin spatiu
		
		int count=0;
		for (int i=0; i< array.length; i++) {
			if (array[i].equals("Nulla")){ //to uppercase, to lower case sa transform in litera mare sau mica
				//equalsIgnoreCase ca sa le ia si pe cele cu litere mari si mici
				count++;
			}
		}
		System.out.println("Cuvantul Nulla apare de :" +count );
		
	}
	public static void countMethod2() {
		List<Integer> indices =new ArrayList<>();
		
		StringBuilder sb= new StringBuilder(text);
		int index=0;
		while (index <sb.length()) {
			int wordIndex=sb.indexOf("Nulla ", index);
			if (wordIndex ==-1) {
				break;
			}
			indices.add(wordIndex);
			index=wordIndex+"Nula ".length(); //primul index al cuvantului Nula si plus dimensiunea lui ca sa sara peste el			
		}
		System.out.println("Method2: Cuvantul Nulla apare de" +indices.size());

		
	}

}
