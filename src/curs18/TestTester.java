package curs18;

public class TestTester {

	public static void main(String[] args) {
		Tester t1= new Tester<Integer>(123);  //sau Tester t1 = new Tester(123);
		t1.printAge();
		
		Tester t2=new Tester("old");
		t2.printAge();

	}

}
