package curs18;

//ii trebuie un T sus la clasa dc avem o variabila a clasei de tip generic
public class Tester<T> {
	//String age;
//	int age2;
	
	T age;
	
	public Tester(T age) {
		this.age= age;
	}
	public void printAge() {
		System.out.println("Data type-ul lui age este: "+age.getClass());
	}

}
