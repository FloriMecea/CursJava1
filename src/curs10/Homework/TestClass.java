package curs10.Homework;

public class TestClass {
	
	public void verificaMotorizarea(Vehicul vehicul) {
		System.out.println(vehicul.nume());
		System.out.println(vehicul.motorizare());
	}

	public static void main(String[] args) {
		
		Vehicul vehicul1=new Vehicul(); //adaugat in plus de mine sa inteleg mai bine
		Vehicul vehicul2=new Bicicleta("Bicicleta","0",15);
		Vehicul vehicul3= new Masina("BMW", "4", 200);
		
		//adaugat in plus de mine sa inteleg mai bine
		TestClass obj= new TestClass();
		System.out.println("--------------Detalii vehicul------------");
		obj.verificaMotorizarea(vehicul1);
		vehicul1.detaliiVehicul();
		
		System.out.println("-------------Detalii bicicleta-------------");
		obj.verificaMotorizarea(vehicul2);
		vehicul2.detaliiVehicul();
		System.out.println("-----------Detalii masina----------------");
		obj.verificaMotorizarea(vehicul3);
		vehicul3.detaliiVehicul();
		
		System.out.println("--------Detalii vehicul din nou dupa ce au fost suprascrise metodele------");
		obj.verificaMotorizarea(vehicul1);
	
		
		

	}

}
