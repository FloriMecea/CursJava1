package curs6;

import java.util.Scanner;

public class DiceGame {

	/*
	 * 
	 * Facem un joc de zaruri care are urmatoarele reguli:
	 * daca userul da: 2,6,12 -> pierdut jocul -> ne oprim -break
	 * daca userul da: 7,11 -->castiga jocul-> ne oprim-break
	 * daca userul da 3, 10 --> repeta aruncarea automat -continue
	 * daca userul da oricare dintre optiunile lipsa intrebam dc vrea sa mai dea inca o data
	 * raspunsul va fi un boolean: true, false -> ne oprim dc boolean false
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean condition=true;
		
		//int dice1 = (int) (Math.random()*6+1);  //0.0 -0.99
	//	System.out.println(dice1);
		
		while (condition) {
			int dice1 = (int) (Math.random()*6+1); 
			int dice2 = (int) (Math.random()*6+1); 
			int total= dice1+dice2;
			
			System.out.println("Felicitari!. Ai dat:" + total);
			
			System.out.println("dice1=" +dice1);
			System.out.println("dice2="+dice2);
					
	   
		
		if (total ==2 || total==6 || total==12) {
			System.out.println("Imi pare rau!. Ai dat:" + total + " Ai pierdut jocul");
			break;			
		} else if (total ==7 || total==11) {
			System.out.println("Felicitari!. Ai dat:" + total + " Ai castigat jocul");
			break;			
		}else if (total ==3 || total==10) {
				System.out.println("Ai dat:" + total + " Jocul continua: Automat mai dai o data");
				continue;			
		}else {
			System.out.println("Mai dai o data?");
			Scanner scan= new Scanner(System.in);
			condition= scan.nextBoolean();			
		}
		
		}
		System.out.println("Game over");

	}

}
