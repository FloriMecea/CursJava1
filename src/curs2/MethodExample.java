package curs2;

public class MethodExample {
	/*
	 * numar de camere dinamic
	 * calcul al mp al fiecarei camere
	 * nr total de mp
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//room1
		int lenght=4;
		int width=2;
		int totalMP= lenght * width;
		System.out.println("Aria camerei 1 este: " +totalMP);
		
		//room2
		int lenght2=3;
		int width2=4;
		int totalMP2= lenght2 * width2;
		System.out.println("Aria camerei 2 este: " +totalMP2);
		
		
		MethodExample room= new MethodExample();
		System.out.println(room.calculateArea(4, 2));
		MethodExample room2= new MethodExample();
		room2.calculateArea(3, 4);
		MethodExample room3= new MethodExample();
		room3.calculateArea(4, 4);
		
		MethodExample room4= new MethodExample();
		room4.calculateArea2 (5,2);
		
		
		int total1= room.calculateArea(2, 1)+ room2.calculateArea(6, 3);
		System.out.println(total1);
		
		System.out.println();
		
		System.out.println(calculateTotal(room.calculateArea(4, 2), room2.calculateArea(3, 4), room3.calculateArea(4, 4)));
		
	}
	

	
	public int calculateArea(int length, int width) {
		
		return length * width;
	}

	
	public void calculateArea2(int length, int width) {
		System.out.println("Aria camerei  este: " + length*width);
	}

	
	public static int calculateTotal(int...rooms) { //varargs -argumente variabile  int...rooms va fi int[] rooms -o lista de rooms)
		int result=0;
		for (int room: rooms) {
			result=result +room;
			//result=0+8;
			//8=8+12;
			//20=20+16;
		}
		
		return result;	
	}
	
}
