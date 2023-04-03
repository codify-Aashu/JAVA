package p1;



import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		File f = new File("/Users/ashishtiwari/Desktop/test1.txt");
		
		try {
			FileReader fr = new FileReader(f);
			char [] ch= new char[(int)f.length()];// here type casting is used..
			fr.read(ch);
			for (char c:ch) {// for each loop ...
				System.out.print(c);
			
				// println is used to print line by line //and print is used to print in o
				// one line..
			}
		} catch (Exception e) {
			

			e.printStackTrace();
		}
		

		

	}
}

		
		
	


