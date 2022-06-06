package curs4;


public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Diferenta dintre
		 * && AND -face short circuit (nu mai executa a doua conditie daca prima e deja falsa
		 * (x !=0) && (1/x>5)  face asa: evalueaza prima conditie si dc e true atunci mai evalueaza conditia a doua
		 * altfel pe a doua nu o mai verifica
		 * 
		 * 
		 * &  -AND la nivel de bit
		 * (x !=0) & (1/x>5) face asa: evalueaza prima conditie, apoi evalueaza conditia2 si apoi aplica & intre ele
		 *
		 * a ||b  --> evalueaza A si daca A este false atunci evalueaza B, dc prima este deja true nu mai evalueaza conditia2 ca oricum este true
		 * 
		 *   a |b  --> evalueaza A si dp evalueaza B si dupa aplica |
		 *
		 */

		int x=0;
		if ((x !=0) && (1/x>5)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
