package inheritanceassignment;

public class MultiChild1 extends MultiParent1 {

	int p=11;
	int q=22;
	public void subtract()
	{
		System.out.println(q-p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild1 obj1 = new MultiChild1();
		obj1.subtract();
		obj1.display();
		obj1.multiply();
	}

}
