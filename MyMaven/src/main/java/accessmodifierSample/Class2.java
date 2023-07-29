package accessmodifierSample;

public class Class2 extends Class1 {
	public static void subtract()
	{
		int c=22;
		int d=10;
		System.out.println(c-d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2.subtract();
		Class1.add();
System.out.println(Class1.name);
	}

}
