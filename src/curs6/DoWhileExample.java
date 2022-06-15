package curs6;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array= {"zero","unu", "doi", "trei"};
		
		int i=0;
		
		do {  //executa cel putin o data corpul si apoi evalueaza conditia
			System.out.println(array[i]);
			i++;
		}while (i<array.length);

		System.out.println("-------------------------");	
		
		int j=0;
		while (j<array.length) {
			System.out.println(array[j]);
			j++;
		}
		
	}

}
