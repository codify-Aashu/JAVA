package constructorchaining;

public class A {
	A(){
		System.out.println(1);
		
	}
	A(int x){
		this();
		
	}
	 A(int x, int y){
		 this(10);
		 
	 }
	 public static void main(String[] args) {
		 A a1 = new A(100,200);
		
	}

}
