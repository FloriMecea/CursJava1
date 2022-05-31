package curs2;

public class Tester {
	
	//variabile
	private String nume;
	private int ratePerHour;
	private int age;

	//constructorul clasei - cand nu punem unu, creaza java un default constructor ca mai jos
/*	public Tester() {
		
	}
	*/
	
	public Tester(String nume, int ratePerHour, int age) {
		setNume(nume);
		setRatePerHour(ratePerHour);
		setAge(age);
	}
	
	//metode getter & setter - s epot folosi in si aceasi clasa in main, dar nu are rost
	// metodele astea se folosesc doar in alte clase 
	
	public String getNume() {
		return nume;
	}
	
	//this:  se foloseste dc este acelasi nume de variabila, dc aveam
	private void setNume(String nume) {
		this.nume = nume;
	}
	// sau asa dc avem nume diferite de variabile:
	//public void setNume(String nume1) {
	//	nume = nume1;
	//}
	
	public int getRatePerHour() {
		return ratePerHour;
	}
	private void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	
}
