package p1;

public class A {
	public void test() {
		System.out.println(1);
		
	}
	public void test(int x) {
		System.out.println(x);
		
	}
	public void test(int x, int y) 
	{
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		a1.test(10);
		a1.test(200,300);
				
	}

}
