package inheritance;

public class Class2Hierarchy extends ParentHierarchy{
   int x=1;
   int y=3;

public void subtract()
{
	System.out.println(y-x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2Hierarchy obj1 = new Class2Hierarchy();
		obj1.subtract();
		obj1.display();
	}

}
