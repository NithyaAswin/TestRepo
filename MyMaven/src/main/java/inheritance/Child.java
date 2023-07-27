package inheritance;

public class Child extends Parent{
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public static void main(String args[])
	{
		Child obj1 = new Child();
		obj1.sub();
		obj1.display();
		
	}

}
