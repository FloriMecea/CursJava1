package curs8.Homework;

public class DuplicateNumbers {

	public static void main(String[] args) {
	
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana","Bogdan", "Oana", "Ion"};
		
		
		for (int i=0; i< myStringArray.length; i++) {
			String name=myStringArray[i];
			for (int j=i+1; j<myStringArray.length; j++) {
				if (name.equals(myStringArray[j])) {
					System.out.println("Nume duplicat " + name);
				}
			}
		}

	}

}
