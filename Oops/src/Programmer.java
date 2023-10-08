

public class Programmer extends Employee{

	int bonus = 25000;
	
	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		System.out.println(programmer.salary);
		System.out.println(programmer.bonus);
		
	}
}


// Programmer IS-A Employee