package map_hashmap;

import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		Map <Integer,String> studentInfo = new HashMap<>();
		studentInfo.put(100, "panaj");
		studentInfo.put(200, "sam");
		studentInfo.put(300, "lucky");
		studentInfo.put(400, "chiku");
		System.out.println(studentInfo);
		System.out.println(studentInfo.get(100));
		System.out.println();  
		
		
		
	}
	

}
