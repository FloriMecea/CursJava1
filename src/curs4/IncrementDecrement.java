package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//num++  --> post increment
		//++num --> pre increment
		//num+1
		
		System.out.println(" ---POST---   ");
		
		int num=10;
		System.out.println("Valoarea lui num inainte de increment :" + num); //10
		System.out.println("Valoarea lui num in post increment :" + num++);  //10
		System.out.println("Valoarea lui num dp post de increment :" + num);  //11
		
		System.out.println(" ---PRE---   ");
		
		int num2=10;
		System.out.println("Valoarea lui num inainte de increment :" + num2); //10
		System.out.println("Valoarea lui num in pre increment :" +  ++num2);  //11
		System.out.println("Valoarea lui num dp pre de increment :" + num2);  //11
		
		//pre decrement --> --num
		//post decrement -->  num --
		//pre increment --> ++num
		//post increment --> num ++
	}

}
