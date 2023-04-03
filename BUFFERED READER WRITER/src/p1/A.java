package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class A {
	public static void main(String[] args) {
		 try {
			FileReader fr = new FileReader ("/Users/ashishtiwari/Desktop/test1.txt");
			BufferedReader br = new BufferedReader(fr);
			for (int i=0;i<4;i++){
			System.out.println(br.readLine());
			}
		} catch (Exception e) {
			

			e.printStackTrace();
		} 
		
	}

}
