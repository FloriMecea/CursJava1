package curs8;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cities= {"Iasi", "Arad", "Cluj", "Alba" };
		//                  0      1        2       3
		
		
		//System.out.println(cities.length); ==4
		//4 ->ArrayIndexOutOfBoundsException
		
		for(int i=0; i< cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		System.out.println("-----For each--------------");
		
		for (String oras: cities) {
			System.out.println(oras);
		}

	}

}
