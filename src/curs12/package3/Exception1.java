package curs12.package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {
//este checked exceptions
	public static void main(String[] args) throws InterruptedException {
		String[] week= {"L","M","Mi","J","V", "S", "D"};
		
		System.out.println(week[9]); //unchecked exception
		
		for (String day: week) {
			Thread.sleep(2000); //este checked exceptions
			System.out.println(day);
		}

	String filename="nimic";
	File file= new File(filename);
	try {
		FileInputStream stream= new FileInputStream(file); //este checked exceptions
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	}

}
