package inheritanceassignment;

public class Child1 extends Parent1 {
int p=11;
int q=12;
	public void multiply()
	{
		System.out.println(p*q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj1 = new Child1();
		obj1.multiply();
		obj1.add();
	}

}
