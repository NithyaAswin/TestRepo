package SuperPackage;

public class SuperChildConstruct extends SuperParentconstruct {

	public SuperChildConstruct()
	{
		//super();//default constructor
		super(10,20);//parameterised constructor
		System.out.println("Super child constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildConstruct obj1 = new SuperChildConstruct();

		
		
	}

}
