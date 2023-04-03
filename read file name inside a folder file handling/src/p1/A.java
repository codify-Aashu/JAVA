package p1;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File ("/Users/ashishtiwari/Desktop/p2");
		String[] names = f.list();
		for (String s:names) {// for each loop in java copy to one array from another array
			System.out.println(s);
		}
		
	}

}
