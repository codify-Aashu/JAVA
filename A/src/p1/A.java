package p1;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int[] x= {23,32,14,38,7};
		

		for(int i=0;i<x.length;i++) {
			for (int j=0;j<x.length-1;j++) {
				if(x[j]> x[j+1]) {
					int temp = x[j];
					x[j]= x[j+1];
					x[j+1]= temp;
				}
				
			}
			
		}
		for(int j:x) {
			System.out.println(j);
			
		}
		
		
		
	}

}
