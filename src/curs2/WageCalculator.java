package curs2;

public class WageCalculator {
	 
	int hoursWorked=40; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tester tester1= new Tester();  //new Tester ()- este constructorul
		//tester1 are datatype-ul Tester, adica este un obiect din clasa Tester
		//tester1.nume="Ion";  //atribuire directa -merge doar dc variabila este de tip public si nu privat
		//tester1.setNume("Ion"); //2 tipuri de atribuire/setare
		//tester1.setNume("Ion");
		
		
		Tester tester1= new Tester("Ion",20);
		
		//OOP concepte -> Polimorfism, Abstraction, Inheritacnce, Encapsulation
				
		//Tester tester2= new Tester();
		//tester2.nume="Maria";

		Tester tester2= new Tester("Maria",10);
		
		Tester tester3= new Tester("Oana",12);
		
		System.out.println(tester1.getNume().length()); 
		System.out.println(tester2.getNume().length()); 
		System.out.println(tester3.getNume().length()); 
		
		WageCalculator calc=new WageCalculator();
		System.out.println("Salariul lui " + tester1.getNume() + " este:" +
		calc.calculateSalary(tester1.getRatePerHour()));
		
		System.out.println("Salariul lui " + tester2.getNume() + " este:" +
		calc.calculateSalary(tester2.getRatePerHour()));
		
		System.out.println("Salariul lui " + tester3.getNume() + " este:" +
		calc.calculateSalary(tester3.getRatePerHour()));
		
		System.out.println("1"); //string
		System.out.println(2);  //int
		System.out.println('3');  //char
	}
	
    public int calculateSalary(int rateHourly) {
    	return rateHourly * hoursWorked;
    	
    } 
	
	
}
