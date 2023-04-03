
public class A {
	public void test(int x) {
		System.out.println(x);
	}
	public void test(String x) {
		System.out.println(x);
	}
	public void test(char x) {
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.test(100);
		a1.test('A');
		a1.test("Bike");
		
	}
	
	
		
		

	

		
		
	



}
