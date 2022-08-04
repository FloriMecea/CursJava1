package curs18;

public class StringBuilderExample {
	
	//dc vrem sa lucram cu acelasi obiect string folosim stringbuilder
  //poate avea probleme dc folosim mai multe threaduri si sa nu mearga intotdeauna bine
	//stringbuffer stie sa lucreze cu threaduri si e indicat cad avem mai multe fire de executie
	public static void main(String[] args) {
		String text="ceva";
		
		reverseString("Java");
		deleteFromString("Eu invat java");
		replaceFromString("Salut Bogdan", 6,12, "Oana");
		insertIntoString("Salut", 5,"Ion");

	}
	
	public static void reverseString(String text) {
		StringBuilder sb= new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}

	public static void deleteFromString(String text) {
		StringBuilder sb= new StringBuilder(text);
		sb.delete(2, 6); //index de start este inclusiv, indexul de final este exlusiv-adica nu il ia in calcul
		System.out.println(sb);
	}
	
	public static void replaceFromString(String text, int startIndex, int endIndex, String textToReplace) {
		StringBuilder sb= new StringBuilder(text);
		sb.replace(startIndex,endIndex,textToReplace);
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text, int startIndex, String textToInsert) {
		StringBuilder sb= new StringBuilder(text);
		//sb.append(sb, startIndex, endIndex);
		sb.insert(startIndex, textToInsert);
		System.out.println(sb);
	}

}
