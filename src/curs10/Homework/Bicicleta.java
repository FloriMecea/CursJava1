package curs10.Homework;

public class Bicicleta extends Vehicul {

	
	public Bicicleta(String brand, String nivelPoluare,int vitezaMedie) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}
/* daca ar fi trebuit suprascrise si metodele setteri
 *  public void setBrand(String brand) {
		super.setBrand(brand);
	}
	public void setNivelPoluare(String nivelPoluare) {
		super.setNivelPoluare(nivelPoluare);
	}

	public void setVitezaMedie(int vitezaMedie) {
		super.setVitezaMedie(vitezaMedie);
	}
	*/	
	
	public String nume() {
		//String nume1 = "Bicicleta";
		//return nume1;
		return getBrand();
	}

	public String motorizare() {
		String motorizare1 = "Mecanica";
		return motorizare1;
	}
	

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru "+ getBrand() + " este :"+getNivelPoluare()+" si viteza medie atinsa este de " +getVitezaMedie()+ " km/h");
	}
}
