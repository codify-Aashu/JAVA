package p1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("/Users/ashishtiwari/Desktop/test1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("mike");
			bw.newLine();
			bw.write("lucky");
			bw.newLine();
			bw.write("adam");
			bw.newLine();
			bw.close();
			fw.close();
			
			
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		
	}

}
