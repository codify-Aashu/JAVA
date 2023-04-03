
public class A {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test1();
		
	}
	public void test1() {
	this.test2();}
	public void test2() {
		System.out.println(1000);
	}
	

}
