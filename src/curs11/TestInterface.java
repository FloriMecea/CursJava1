package curs11;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Angajat angajat =new Angajat();
		
		Tester tester = new Tester();
		tester.setEmail("oana@oana.com");
		tester.setName("oana");
		tester.printNumeDepartament();
		
		System.out.println("Nume tester:" + tester.getName());
		System.out.println("Email tester:" + tester.getEmail());
		
		
		Developer dev = new Developer();
		dev.setEmail("ioana@oana.com");
		dev.setName("ioana");
		dev.printNumeDepartament();
		
		System.out.println("Nume dev:" + dev.getName());
		System.out.println("Email dev:" + dev.getEmail());
		
	}

}
