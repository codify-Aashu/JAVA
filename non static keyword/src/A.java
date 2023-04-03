
public class A{
	
	public static void main(String[] args) {
		A a1=new A();
		a1.test();
		a1.test(100);
		
	}	
	public void test() {
		System.out.println("test method withoud args");
	}
	public void test(int x) {
		System.out.println("test method with args x = "+x);
		
	}
	
}
		
	// without creating object non static variable cannot be accessed
//not static variable is created outside the method and 
//inside the class without using static keyword
	


