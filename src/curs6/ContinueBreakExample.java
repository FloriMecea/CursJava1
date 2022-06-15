package curs6;

public class ContinueBreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=0; i<10; i++) {
			if (i==5) {
				
				//break; //iese definitiv din for
				continue; //face skip la o rulare cand ajunge la 5 si continua cu restul
			}
			System.out.println(i);
		}
	}

}
