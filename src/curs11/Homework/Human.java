package curs11.Homework;

public class Human extends Primate implements BasicNeeds {

	@Override
	public String eat() {
		return "Omnivore";
	}

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}

	@Override
	public void drink() {
		System.out.println("can drink");
		
	}

}
