package curs7.Homework;

import java.util.Scanner;

public class Bonus {
	int An_vechime=0;
	int valoare_vanzari;
	int luna;
	
	public void readInfo() {
		
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Introduce An vechime:");
        An_vechime=scan.nextInt();
        
        System.out.println("Introduce valoare vanzari:");
        valoare_vanzari=scan.nextInt();
        
        System.out.println("Introduce luna cand ai efectuat vanzarile:");
        luna=scan.nextInt();
		
	}
	
	public int calculBonus(int an, int valoare, int luna) {
		int bonus = 0;
		
		switch (an){
		case 1: {
			bonus=100;
		//	System.out.println("Bonus 100");				
			break;
		}
		case 2: {
			bonus=200;
		//	System.out.println("Bonus 200");
			break;
		}
		case 3: {
			if(valoare<=5000) {
				 bonus=600;
			//     System.out.println("Bonus 600");
			}
			else if (valoare<=10000){ 
					
					 if((luna >=1)&&(luna<=6)) {
						bonus=800;
				   //     System.out.println("Bonus 800");
			         } else if ((luna >=7)&&(luna<=11)){
			        	 bonus=1000;
			        	// System.out.println("Bonus 1000");
			         } else  if (luna ==12){
			        	 bonus=900;
			        	// System.out.println("Bonus 900");
			        	 System.out.println("In decembrie se vand singure");
			         }
			} else if (valoare>10000) {   
				 bonus=1200;
				// System.out.println("Bonus 1200");
			}
			         
			break;

		}
		default: {
			bonus=0;
			System.out.println("Nu ati primit bonus");
		}
	
	}
		return bonus;
}


	public static void main(String[] args) {
		
		Bonus bonus= new Bonus();
		
		bonus.readInfo();
				
		System.out.println("Bonusul tau este: " + bonus.calculBonus(bonus.An_vechime, bonus.valoare_vanzari, bonus.luna));


	}	
		

}
