

public class A {
	public static void main(String[] args) {
		String s1 = "testing timettttt";
		String[] s2 = s1.split(" ");
		String temp = null;
		if(s2[0].length()>s2[1].length()) {
			temp = s2[0];
		}
		if (s2[1].length()>s2[0].length()) {
			temp = s2[1];
		}
		if(temp!=null) {
			System.out.println("the biggest word is :"+temp);
		}else
		{
			System.out.println("Many words with same size!!");
			
		}
	
		
		
	}

}
