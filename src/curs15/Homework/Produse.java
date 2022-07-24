package curs15.Homework;

import java.util.ArrayList;
import java.util.List;

public class Produse {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		list1.add("Product1");
		list1.add("Product2");
		list1.add("Product3");
		list1.add("Product4");
		list1.add("Product5");
		
		List<String> list2= new ArrayList<>();
		list2.add("Product1");
		list2.add("Product2");
		list2.add("Product6");
		list2.add("Product4");
		list2.add("Product8");
		
		System.out.println(list1.size());
		System.out.println(list2.size());
		
		 System.out.print("[");
		for (String element : list1) {
			if (list2.contains(element)) {
			  System.out.print("yes");
			}
			else {
			  System.out.print("no");
			}
			if(list1.indexOf(element) <list1.size()-1) {
			 System.out.print(", ");
			// System.out.println(list1.indexOf(element));
			}
		} 
		
		 System.out.print("]");
	

	}

}
