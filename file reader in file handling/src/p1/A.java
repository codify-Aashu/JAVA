package p1;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		File f = new File("/Users/ashishtiwari/Desktop/test1.txt");
		
		try {
			FileReader fr = new FileReader(f);
			for  (int i=0;i<f.length();i++){
				System.out.print((char)fr.read());// here type casting is used..
				// println is used to print line by line //and print is used to print in o
				// one line..
			}
		} catch (Exception e) {
			

			e.printStackTrace();
		}
		

		

	}
}

		
		
	

		




