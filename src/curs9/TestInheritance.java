package curs9;

public class TestInheritance {

	public static void main(String[] args) {
		TesterAutomat tester= new TesterAutomat();
		
		tester.setProgrammingLanguage("Java"); //metoda este din clasa TesterAutomat
		tester.setDepartament("QA");  //metoda este  din clasa Tester
		tester.setSeniority("Junior");   //metoda este din clasa Tester
		tester.setEmail("matei@matei.com"); //metoda este din clasa Angajat
		tester.setName("Matei"); //metoda este din clasa Angajat
		
		System.out.println(tester.getName());
		System.out.println(tester.getEmail());
		System.out.println(tester.getDepartament());
		System.out.println(tester.getProgrammingLanguage());
		System.out.println(tester.getSeniority());
		
	}

}
