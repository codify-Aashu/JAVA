
public class A{
	{
		System.out.println("from IIB"); 
		

	}
	A(){
		System.out.println("from constructor");
	}
	static {
		System.out.println("from SIB");
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("from main");
		
	}
}

		


		



