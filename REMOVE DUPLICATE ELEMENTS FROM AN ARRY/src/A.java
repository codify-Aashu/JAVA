
public class A {
	public static void main(String[] args) {
		int[] x = {1,1,2,3,4,4,5,5,6};
		int[] temp = new int[x.length];
		int i=0;
		int j=0;
		for(int i1=0; i1<x.length-1;i1++);{
		
		if(x[i]!=x[i+1]) {
			temp[j]= x[i];
			j++;
		}
	}
		temp[j]= x[x.length-1];
		for (int z=0;z<temp.length;z++) {
			System.out.println(temp[z]);
			
			
		}

}
}