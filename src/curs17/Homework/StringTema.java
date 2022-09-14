package curs17.Homework;

public class StringTema {

	public static void main(String[] args) {
		String text="Lorem ipsum dolor sit amet, consectetur "
				+ "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu "
				+ "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, "
				+ "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius "
				+ "malesuada. Nulla neque lacus, euismod quis erat nec, convallis "
				+ "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. "
				+ "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		
		
		StringTema obj= new StringTema();
		System.out.println(text);
		System.out.println("---------------------");
		System.out.println(obj.checkNulla(text));
		System.out.println("---------------------");
		obj.checkPropozitii(text);
		System.out.println("---------------------");
		obj.deleteCaracter(text);
		System.out.println("---------------------");
		obj.inlocuireCaracter(text);

	}
	
	public int checkNulla(String text) {
		int nr=0;
		
		String[] text1= text.split(" ");	
		System.out.println("---Cuvantul Nulla apare de----");
		for (String cuvant:text1) {
			if (cuvant.equals("Nulla")) {
				nr++;
			}
		}
		
		return nr;
	}
	
	public void checkPropozitii(String text) {
		StringBuilder sb= new StringBuilder(text);
		String[] propozitii;
		
		propozitii=sb.toString().split("\\.");
		for (String linie:propozitii) {
			System.out.println(linie);
		}
		
	}
	
	public void deleteCaracter(String text) {
		StringBuilder sb= new StringBuilder(text);
	
		int i=0;
		while (i <sb.length()) {
			int charIndex=sb.indexOf("a", i);
			sb.deleteCharAt(charIndex);
		    i=i+charIndex;
		}
		System.out.println(sb);
	}
	public void inlocuireCaracter(String text) {
		StringBuilder sb= new StringBuilder(text);
	
		int i=0;
		while (i <sb.length()) {
			int charIndex=sb.indexOf("o", i);
			sb.setCharAt(charIndex, '#');
		    i=i+charIndex;
		}
		System.out.println(sb);
	}

}
