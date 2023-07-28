package inheritanceassignment;

public class ClassEmploy extends Parent2 {
	public void employDetails()
	{
		System.out.println("EmpID: 189192");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEmploy obj1 = new ClassEmploy();
		obj1.employDetails();
		obj1.details();
		
	}

}
