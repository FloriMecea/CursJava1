package curs12.package1;

public class ProtectedAccessModifier {
	
	/*
	 * Scopul lui este in acelasi pachet si sub-clase(clase copil care mostenesc) din pachete diferite
	 * Clasele NU pot fi declarate ca protected, doar metodele sau variabilele
	 * 
	 * Aceeasi clasa: yes
	 * Alta clasa acelasi pachet: yes
	 * subclasa in acelasi pachet: yes
	 * 
	 * Subclasa in alt pachet: yes
	 * Alta clasa(care nu e subclasa/copil- nu mosteneste clasa curenta) in alt pachet: no
	 */

	
	protected String mesaj= "Protected Access";
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();
	}
}
