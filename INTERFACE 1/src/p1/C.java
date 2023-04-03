package p1;

public class C implements B {
	public void test1() {
		System.out.println(1);
	}
	public void test2(){
		System.out.println(2);
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
	}
	
	
	
	
	

}
