
public class A {
	public static void main(String[] args) {
		String s1 = "testtt timee run";
		String[] s2 = s1.split(" ");
		String temp = null;
		if(s2[0].length()>s2[1].length() && s2[0].length()>s2[2].length()) {
			temp = s2[0];
		}
		if(s2[1].length()>s2[0].length() && s2[1].length()>s2[2].length()){
			temp = s2[2];
		}
		if(s2[2].length()>s2[0].length() && s2[2].length()>s2[1].length()) {
			temp = s2[2];
			
		}
		if(temp!=null) {
			System.out.println( "the biggest word:"+temp);
		}else {
			System.out.println("many words with same size!!");
		}
	} 
	
	

}
