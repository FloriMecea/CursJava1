package curs12.package1;

class DefaultAccessModifier { //dc sterg public din fata inseamna ca este default

	/* Default inseamna ca nu specificam niciun access modifier in fata clasei, metode, variabile
	 * Scopul este limitat la pachetul in care se afla, restrictionez sa fie folosite metode/variabile default in alte pachete
	 * 
	 * Same class: yes
	 * Subclass in acelasi pachet: yes
	 * Alta clasa in acelasi pachet: yes
	 * 
	 * Subclasa in alt pachet: no
	 * Alta clasa in alt pachet: no
	 */
	
	String mesaj="Default modifier";
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAccessModifier obj= new DefaultAccessModifier();
		obj.printMesaj();
	}

}
