
public class C extends A,B() {// multiple inheritance not allowed 
	public void test2() {
		System.out.println("from test2");
		
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test3();
	}
	

}
