package p1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class B {
	public static void main(String[] args) {
		
		try {
			FileInputStream fos	=
					new FileInputStream("/Users/ashishtiwari/Desktop/file.ser");
			ObjectInputStream oos = new ObjectInputStream(fos);
			A a = (A)oos.readObject();// class downcasting...
			System.out.println(a.city);
			System.out.println(a.password);
			
		} catch (Exception e) {
			e.printStackTrace();
			

		}
		
	}
	

}
