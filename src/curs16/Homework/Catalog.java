package curs16.Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Catalog {

	public static void main(String[] args) {
		Map<String, Integer> catalog = new HashMap<>(); 
		String nume;
		int nota;
		
		catalog.put("George", 10);
		catalog.put("Daniel", 7);
		catalog.put("Marian", 5);
		catalog.put("Costica", 6);
		
		System.out.println("----Afisam catalogul initial-------------");
		for (String key: catalog.keySet()) {
			System.out.println("Nume: "+key);
		}
		
		System.out.println("-----------------");
		for (int value: catalog.values()) {
			System.out.println("Nota: "+value);
		}
		
		
		System.out.println("-----------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cum te cheama?");
		nume = scan.next();
		System.out.println("Ce nota ai luat?");
		nota = scan.nextInt();
		
		if (!catalog.containsKey(nume)) {
			catalog.put(nume, nota);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		}
		else if(nota<=catalog.get(nume)) {
			System.out.println("Nu ai nevoie de alta nota");
		}
		else if(nota>catalog.get(nume)) {
			catalog.replace(nume, nota);
		}
		
		System.out.println("----Afisam catalogul final-------------");
		for (String key: catalog.keySet()) {
			System.out.println("Nume: "+key);
		}
		
		System.out.println("-----------------");
		for (int value: catalog.values()) {
			System.out.println("Nota: "+value);
		}
		
	}

}
