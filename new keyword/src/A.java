
public class A {
	public static int specialArray(int n,int[]arr) {
		
		for (int i=0; i<n;i++) {
			int sum=0;
			
		    for(int j=0;j<1;j++) {
		    	
		    	sum+=arr[j];
		    	
		    }
		    if (sum>=arr[i]) {
		    	return 0;
		    	
		    }
			
			
		}

		return 1;

	}

}
