package curs14;

import java.io.IOException;

public class TestTextFileProcessor {

	public static void main(String[] args) throws IOException {
		TextFileProcessor obj= new TextFileProcessor();
		
		obj.writeFile("Textul \n");
		
		obj.readFile();
		
		System.out.println("--------------------------");
		
		obj.updateFile("Alt text in fisier\n");
		obj.updateFile("Alta linie\n");
		obj.readFile();
		System.out.println("--------------------------");
		
		obj.deleteLineFromFile("Alta linie","");
		obj.readFile();
		
		System.out.println("--------------------------");
	//	obj.deleteFile();
		

	}

}
