package Mavenpackage;

public class NonStaticSample {
    public void print() //instance method
    {
	System.out.println("This is an instance method");
    }
    public char div(String nam,char p)
    {
    	System.out.println(nam);
    	//System.out.println(p);
    	return p;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticSample obj1 = new NonStaticSample();
		obj1.print();
		
		obj1.div("Nithya",'N');

	}

}
