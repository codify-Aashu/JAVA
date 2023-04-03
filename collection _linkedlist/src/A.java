import java.util.LinkedList;



public class A {
	public static void main(String[] args) {
		employee arun = new employee("Arun","k",100);
		employee ravi = new employee("ravi","kirran",200);
		employee santosh = new employee("Santosh","m",300);
		
		LinkedList<employee> empDetails = new LinkedList<employee>();
		empDetails.add(arun);
		empDetails.add(ravi);
		empDetails.add(santosh);
		System.out.println(empDetails);
		
		for (employee employee : empDetails) { 
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getId());
			
		}
		
		
		
	}
	

}
