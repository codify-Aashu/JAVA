package p1;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("/Users/ashishtiwari/Desktop/test.rtf");
		long val = f.length();
		// exit,delete,length
		//boolean val = f.length();
		System.out.println(val);
	}

}
