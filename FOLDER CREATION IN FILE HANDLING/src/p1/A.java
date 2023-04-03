package p1;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("/Users/ashishtiwari/Desktop/test/p2");
		boolean val = f.mkdir();
		System.out.println(val);
	} 
	

}
// it is non static method present in file class,return type of this method is boolean value.