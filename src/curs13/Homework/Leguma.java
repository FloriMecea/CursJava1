package curs13.Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class Leguma {
	public void writePropertiesFile() throws IOException {
		try (OutputStream outPutStream= new FileOutputStream("leguma.properties")) {
			
			//canalul de comunicare catre 
			
			
			//fisierul nostru de tip properties
			Properties prop= new Properties();
			prop.setProperty("morcov","58"); //cheie=morcov, valoare=58
			prop.setProperty("rosie","20");
			prop.setProperty("castravete","21");
			prop.setProperty("vanata","40");
			prop.setProperty("varza","15");
			
			prop.store(outPutStream, "am salvat fisierul properties");  //salvam fisierul
			
			System.out.println("Inside write prop file:"+prop);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String readPropertiesFile(String key) throws IOException {
		
		String value=null;
		
		try (InputStream inputStream= new FileInputStream("leguma.properties")){
			Properties prop= new Properties();
			prop.load(inputStream);
			
			 value=prop.getProperty(key);
			System.out.println(value);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void main(String[] args) throws IOException {
		Leguma leguma =new Leguma();
		leguma.writePropertiesFile();
		    
        
		Scanner scan= new Scanner(System.in);
        String legumaInStoc=null;
        
        while(legumaInStoc==null) {
        	
            System.out.println("Ce leguma vreti sa cumparati?");
    		
            String legumaDorita= scan.next();
            legumaInStoc=leguma.readPropertiesFile(legumaDorita);
        	 if (legumaInStoc!=null) {
             	System.out.println("Leguma aleasa de tine are " + legumaInStoc  +" calorii");
             	
             }
             else {
             	System.out.println("Nu vindem aceasta leguma");
                 System.out.println("Va rog sa alegeti alta leguma");
             	
             }
        }
        
        scan.close();
        
		

	}

}
