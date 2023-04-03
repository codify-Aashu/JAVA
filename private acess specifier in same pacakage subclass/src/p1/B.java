package p1;

public class B  extends A{
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
		b1.test();// not possible to acess in same pacakge in subclass
		
		
	}

}
