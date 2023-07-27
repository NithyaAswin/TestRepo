package inheritance;

public class Class1Hierarchy extends ParentHierarchy {
int a=11;
int b=12;
int c=13;
public void add()
{
	System.out.println(a+b+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1Hierarchy obj1 =new Class1Hierarchy();
		obj1.add();
		obj1.display();
	}

}
