package curs12.package1;

public class PrivateAccessModifier {
 /*
  * Scopul este limitat la clasa in care se afla
  * clasa sau interfata nu poate fi declarata ca private ca apoi devine foarte greu de folosit
  * 
  * 
  * aceasi clasa:yes
  * 
  * subclasa acelasi pachet:no
  * alat clasa acelasi pachet: no
  * subclasa alt pachet: no
  * alta clasa alt pachet: no
  */
	private String mesaj="Private";
	
	//private PrivateAccessModifier();
	
	public static void main(String[] args) {
		
	}
}
