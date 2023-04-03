
public class A {
	A(){
		System.out.println(1);
		
	}
	 A(int x){
		 this();
		 System.out.println(x);
	 }
	 public static void main(String[] args) {
		 A a1 = new A(100); 
		
	}

}
