package curs10.Homework;

public class Masina extends Vehicul {
	
	public Masina(String brand, String nivelPoluare,int vitezaMedie) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
		
	}
	public String nume() {
	//	String nume1 = "Masina";
	//	return nume1;
		return getBrand();
	}

	public String motorizare() {
		String motorizare1 = "Benzina";
		return motorizare1;
	}
	
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru "+ getBrand() + " este :"+getNivelPoluare()+" si viteza medie atinsa este de " +getVitezaMedie()+ " km/h");
	}
}
