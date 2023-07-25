package Mavenpackage;

public class OverloadingSample {
	public static void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void subtract(int c,int d,int e)
	{
		System.out.println(c-d-e);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingSample.subtract(10,7);
		OverloadingSample.subtract(8,5,1);
	}

}
//methods with same name and different parameters