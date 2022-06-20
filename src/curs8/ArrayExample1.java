package curs8;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] textArray=new String[5];
		//String[] textArray= {null, null, null, null, null}
		
		String text2[] =new String[4]; //alta modalitate de declarare dar e mai apropiat de c
		
		textArray[0]="This";
		//String[] textArray= {"This", null, null, null, null}
		//index of array         0      1     2     3     4
		
		System.out.println(textArray[2]);
		System.out.println(textArray[0]);
		
		textArray[1]=" is ";
		//String[] textArray= {"This", "is", null, null, null}
		textArray[2]=" an ";
		textArray[3]=" array ";
		textArray[4]=" ! ";
		//String[] textArray= {"This", "is", "an", "array", "!"}
		
		for (String element: textArray) { //este un for each si poate fi inlocuit cu un for obisnuit cu index i
			System.out.print(element);
		}
		
		for (String aa: textArray) {
			System.out.print(aa);
		}
	}

}
