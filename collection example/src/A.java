
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A {
	public static void main(String[] args) {
		//ArrayList<Integer> x = new ArrayList<Integer>();// GENERICS...
		List<Integer>x=new LinkedList<Integer>();// GENERICS..
		x.add(10);// boxing...
		x.add(20);
		x.add(30);
		System.out.println("add method():"+x);//boxing...
		x.add(1,500);
		System.out.println("add(index,value) method:"+x);
		
		
		//ArrayList<Integer> y = new ArrayList<Integer>();
		List<Integer>y=new LinkedList<Integer>();
		y.add(300);
		y.add(500);
		
		x.addAll(2,y);
		System.out.println("addAll(index,collection) method():"+x);
	
		if(x.contains(5000)) {// object present or not..
			System.out.println("yes present");
			
		}else {
			System.out.println("not present");
		}
		//x.remove(1);
		//System.out.println("remove(index) method():"+x);// remove the object
		 
		System.out.println(x.get(1));
		
		Iterator itr = x.iterator();// using iterator read the value
		
		while(itr.hasNext()) {
			System.out.println("value of x:"+itr.next());
			
		}
		
		
		
		
		
	}

}
