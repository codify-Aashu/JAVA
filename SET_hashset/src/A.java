import java.util.LinkedHashSet;

public class A {
	public static void main(String[] args) {
		//HashSet<Integer> hasSet = new HashSet<Integer>();
		LinkedHashSet<Integer> hasSet = new LinkedHashSet<Integer>();
		
		hasSet.add(20);
		hasSet.add(30);
		hasSet.add(40);
		hasSet.add(500);
		hasSet.add(60);
		hasSet.add(60);
		System.out.println(hasSet);
		
	}

}
