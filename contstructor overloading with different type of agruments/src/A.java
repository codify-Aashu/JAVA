
public class A {
	A(int x){
		System.out.println(x);     
		
	}
	A(char x){
		System.out.println(x);
		
	}
	A(String x){
		System.out.println(x);
	}
	public static void main(String[] args) {
	 
		A a1 = new A(10);
		A a2 = new A('a');
		A a3 = new A("mike");
				
	}

}
