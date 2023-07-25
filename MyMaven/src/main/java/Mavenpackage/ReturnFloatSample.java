package Mavenpackage;

public class ReturnFloatSample {
	static byte b=5;
	public static float details(float x,char c)
	{
		System.out.println(c);
		return x;
	}
public static char ReturnChar()
{
	char a='A';
	return a;
}
public static byte ReturnByte()
{
	return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ReturnFloatSample.details(3.2f,'A'));
		System.out.println(ReturnFloatSample.ReturnChar());
        System.out.println(ReturnFloatSample.ReturnByte());
	}

}
