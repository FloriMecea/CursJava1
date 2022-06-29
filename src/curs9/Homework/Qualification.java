package curs9.Homework;

public class Qualification extends Teacher {
	
	public void Qualification(String curs, int expYears, String Sch) {
		//only if the variables are not private
		//this.Course= curs;
		//this.ExperienceYears=expYears;		
		//this.Schedule=Sch;
		
		//if the variables are private use the setters
		setCourse(curs);
		setExperienceYears(expYears);
		setSchedule(Sch);

	}
	
	public void verify(String curs, int expYears, String Sch) {
		//Daca xperienceYears sunt mai mari ca 3 si daca course este egal cu “Java” si daca schedule este egal cu “Afternoon”
		if ((expYears>3) && curs.equals("Java") && Sch.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Qualification teacher1 = new Qualification();
		teacher1.verify("Java", 5, "Afternoon" );
		teacher1.verify("Java", 2, "Afternoon" );
	}

}
