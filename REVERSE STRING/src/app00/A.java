package app00;

public class A {
	public static void main(String[] args) {
		String s1 = "testing";
		int size = s1.length();
		String reverse = "";
		for(int i=size-1;i>=0;i--) {
			System.out.println(s1.charAt(i));{
				reverse = reverse + s1.charAt(i);
			}
			System.out.println(reverse);
			
		}
		
		
	}

}
