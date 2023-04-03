package p1;

import java.io.File;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		File f = new File ("/Users/ashishtiwari/Desktop/test1.txt");
		try {
			boolean val = f.createNewFile();
			System.out.println(val);
		} catch (IOException e) {
			

			e.printStackTrace();
		}
	}

}
