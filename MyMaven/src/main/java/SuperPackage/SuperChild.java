package SuperPackage;

public class SuperChild extends SuperParent {
public void display()
{
	System.out.println("super child class");
	System.out.println(super.a);
	super.print();//method
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(super.s);//can refere only instance variable
		//cannot call sttaic varaiable
SuperChild obj1 = new SuperChild();
obj1.display();
//obj1.print();
	}

}
//can refere only instance variable
//cannot call sttaic varaiable
