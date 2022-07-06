package curs12.package2;

import curs12.package1.ProtectedAccessModifier;

public class OtherClassProtectedAccessModifier {
	
	 // Alta clasa(care nu e subclasa/copil- nu mosteneste clasa curenta) in alt pachet: no
  //dc nu mostenesti si esti in alt pachet atunci nu merge

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		// obj.printMesaj(); //nu merge pt ca mesaj si print mesaj sunt protected
	}

}
