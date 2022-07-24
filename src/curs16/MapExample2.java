package curs16;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
	
public static void main(String[] args) {
	
	Map<Integer,String> map1= new HashMap<>();
	
	map1.put(1, "negru");
	map1.put(123, "alb");
	map1.put(88, "rosu");
	map1.put(123, "verde");  //nu pot avea chei duplicate caci suprascrie valoarea
	
	System.out.println(map1);
	
	Map<Integer,String> map2= new HashMap<>();
	
	map2.put(11, "negru");
	map2.put(33, "maro");
	map2.put(888, "rosu");  //nu pot avea chei duplicate caci suprascrie valoarea
	
	System.out.println(map2);
	
	System.out.println("----------------");
	
	map1.putAll(map2);
	
	
	System.out.println("update map " +map1);
}
}
