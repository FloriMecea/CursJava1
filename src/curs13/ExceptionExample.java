package curs13;

public class ExceptionExample {

	public static void main(String[] args) {
		
		String nume=null;
		int [] array = {1,2,3,4};
		
		
		try {
			System.out.println("salut" +nume);
			try {
				int x=3;
				System.out.println(array[x]);
				System.out.println(nume.length());
			}catch (IndexOutOfBoundsException e) {
				System.out.println("index out of bound!");
			}
			
			
		}catch (NullPointerException e) {
			System.out.println("Null Error occured");
		}

	}

}
