package hash_map;

import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		Map<Integer,String> StudentInfo = new HashMap<>();
		StudentInfo.put(100,"Pankaj");
		StudentInfo.put(101,"Ravi");
		StudentInfo.put(102, "sam");
		
		System.out.println(StudentInfo);
		System.out.println(StudentInfo.get(102));
		System.out.println(StudentInfo.values());
		System.out.println(StudentInfo.keySet());
		
		
	}

}
