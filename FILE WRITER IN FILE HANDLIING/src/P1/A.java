package P1;

import java.io.FileWriter;
import java.io.IOException;

public class A {
	public static void main(String[] args)  {
		 try {
			FileWriter fr = new FileWriter("/Users/ashishtiwari/Desktop/test1.txt",true);
			// 3 ways to write into a file 
			   // 1.fr.write("mike");//string
			        //2 fr.write("97"); // number
			      // 3.char [] ch = {'a','b','c',}; // char value
			    //  fr.write(ch);
			        
			   
			   
			   // close ----save and close
			   fr.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
