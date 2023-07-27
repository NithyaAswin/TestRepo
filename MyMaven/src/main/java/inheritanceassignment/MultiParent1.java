package inheritanceassignment;

public class MultiParent1 extends MultiGrand1 {
String s="This is the Parent class";
public void display()
{
	MultiParent1 obj1 = new MultiParent1();
	obj1.multiply();
	System.out.println(s);
}
}
