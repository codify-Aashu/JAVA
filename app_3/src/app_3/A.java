// constructor overloading-  more than on constructor in same class provided they have different number of 
// arguments or diffenent type of arguments .
package app_3;


public class A {
	
	A(){
		System.out.println(1); }
		A(int x){
		  System.out.println(x);
		
		
		
	}
		A(int x,int y){
		System.out.println(x);
		System.out.println(y);}
		 
		
		
		
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(2);
		A a3 = new A(3,4);
	}

}
