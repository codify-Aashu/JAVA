package p1;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int x,y,temp;
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		
		 temp =x;
		 x=y;
		 y=temp;
		 System.out.println("after swapping:"+x+" "+y);
		 
		 System.out.println();

	}

}
