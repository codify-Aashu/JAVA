package overriding;

public class B extends A {
	
	public void test2() {
		System.out.println(500);
		
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
		A a1 = new A();
		a1.test();
		// inheritance + modify the logic of inherited method;
		// overriding means we inherit the method of parent class and modify the logic 
		// of inherited method...
		
	}
	
	

}
