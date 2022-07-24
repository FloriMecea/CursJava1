package curs14.Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CelMaiLungCuvant {
	public void writeFile( String textToWrite) {
		try {
			FileWriter myFileWriter=new FileWriter("file1.txt");
			myFileWriter.write(textToWrite);
			myFileWriter.close();
			System.out.println("Successfully wrote to file1");
		}catch(IOException e) {
			System.out.println("Cannot write to file1");
			e.printStackTrace();
		}
	}
	
	/*
	 * read from txt file
	 */
	
	
	public String checkWordFromFile() {
		File objFile= new File("file1.txt");
		String LongWord="";
		
		try {
			Scanner scan= new Scanner(objFile);
			while(scan.hasNext()) {
				String text = scan.next();
				System.out.println("Cuvant:"+text);
				if (text.length()>LongWord.length()) {
					LongWord=text;
				}
			}
			scan.close();
		} catch(IOException e) {
			System.out.println("Cannot read from file");
			e.printStackTrace();
		}
		return LongWord;
		
	}

	public static void main(String[] args) {
		CelMaiLungCuvant obj= new CelMaiLungCuvant();
		obj.writeFile("alandala , merepere, aaaaaaaaaaaaaaaaaaaaaa, bbbb, ccccccccccccccccccccccccccc\n"
				+ "linia222222222222222222222222222222222222222\n"
				+ "linia3\n"
				+ "linia4");
     
        
        System.out.println("---------------------------------------"); 
       System.out.println("Cel mai lung cuvant este: " + obj.checkWordFromFile()); 
		 
	}

}
