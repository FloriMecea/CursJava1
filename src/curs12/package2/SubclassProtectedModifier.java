package curs12.package2;

import curs12.package1.ProtectedAccessModifier;

public class SubclassProtectedModifier extends ProtectedAccessModifier {

	public static void main(String[] args) {
		// * Subclasa in alt pachet: yes
		
		SubclassProtectedModifier obj = new SubclassProtectedModifier();
		obj.printMesaj();

	}

}
