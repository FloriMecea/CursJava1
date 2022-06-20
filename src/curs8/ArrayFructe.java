package curs8;

public class ArrayFructe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fructe objMar= new Fructe("Mar",150);
   Fructe [] fruct= new Fructe[4];
   //Fructe[] fruct= {null, null, null, null}
   
   
   fruct[0]= new Fructe("Banana",250);
   //Fructe[] fruct= {objBanana, null, null, null}
   fruct[0].printDetails();
   //Fructe[] fruct= {objBanana, null, null, null}
   
   fruct[1]=objMar;
   //Fructe[] fruct= {objBanana, objMar, null, null}
   fruct[1].printDetails();
   objMar.printDetails();
   
   System.out.println("---------------");
   objMar=new Fructe ("ionatan",150);

   objMar.printDetails();
   fruct[1].printDetails();
   
   fruct[2]= new Fructe("Para", 200);
   fruct[3]= new Fructe("Cireasa", 80);
   
   for (Fructe element : fruct) {
	   element.printDetails();
   }
   
   
	}

}
