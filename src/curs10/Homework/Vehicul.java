package curs10.Homework;

public class Vehicul {
	private String brand;
	private String nivelPoluare;
	private int vitezaMedie;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNivelPoluare() {
		return nivelPoluare;
	}
	public void setNivelPoluare(String nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}
	public int getVitezaMedie() {
		return vitezaMedie;
	}
	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	
	public String nume() {
		String nume1 = "Vehicul";
		return nume1;
	}

	public String motorizare() {
		String motorizare1 = "Diesel";
		return motorizare1;
	}
	
	public void detaliiVehicul() {
		System.out.println("“Nivelul de poluare pentru masina Dacia este :5 si viteza medie atinsa este de 180 km/h”");
	}
}
