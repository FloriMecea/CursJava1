package curs16;

import java.util.ArrayList;
import java.util.List;

public class TesterArrayList {

	public static void main(String[] args) {
		Tester t1= new Tester("Oana", 22, "QA");
		Tester t2= new Tester("Maria", 29, "QA");
		Tester t3= new Tester("Ion", 27, "QA");

		List <Tester> testerList= new ArrayList<>();
		testerList.add(t1);
		testerList.add(t2);
		testerList.add(t3);
	//	System.out.println(testerList.get(0).nume);
	//	System.out.println(t1.nume);
		
		for (Tester t: testerList) {
			System.out.println(t.nume+"|"+ t.age +"|" +t.departament);
		}
	}
	


}
