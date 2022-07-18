package curs15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		//ArrayList<String> list2=new ArrayList<>();
		//lista are marime dinamica: este creat si populat dinamic
		
		//List<Integer> list= new ArrayList<>();
		//List<T> list= new ArrayList<>();
		
		System.out.println(list.size());
		//add elements to a list
		list.add("Oana");
		System.out.println(list.size());
		list.add("Ioana");
		list.add("Maria");
		list.add("Ion");
		System.out.println(list.size());
		
		for (String nume : list) {
			//System.out.println(nume);
			System.out.println(list.indexOf(nume)+":"+nume);
		}
		
		System.out.println("---------------------------");
		list.add(0,"Bogdan");
		
		for (String nume : list) {
			//System.out.println(nume);
			System.out.println(list.indexOf(nume)+":"+nume);
		}
		
		System.out.println(list.get(3));
		
		list.remove(0);
		list.remove("Maria");
		
		System.out.println("---------------------------");
		
		for (String nume : list) {
			//System.out.println(nume);
			System.out.println(list.indexOf(nume)+":"+nume);
		}
		
		list.set(0,  "Carmen"); //inlocuieste/updateaza pozitia 0
		
		
		System.out.println("---------------------------");
		
		for (String nume : list) {
			//System.out.println(nume);
			System.out.println(list.indexOf(nume)+":"+nume);
		}
		
		System.out.println(list.contains("Ioana"));
		System.out.println(list.contains("Matei"));
	}

}
