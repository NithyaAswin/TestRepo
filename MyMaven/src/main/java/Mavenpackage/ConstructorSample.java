package Mavenpackage;

public class  ConstructorSample
		{
			public ConstructorSample(float a,String name)
			
			{
				System.out.println(a);
				System.out.println(name);
			}
		 public ConstructorSample()
		 {
		  //default constructor
		  System.out.println("This is a default onstructor");
		  }
		public static void main(String args[])
		{
			//create object-
		ConstructorSample obj = new ConstructorSample();
		//constructor is invoked when object is created(implicitly invoked)

		//parmaterised object then create new object
		ConstructorSample obj1=new ConstructorSample(2.5f,"Nithya");                                     
		}

		}

