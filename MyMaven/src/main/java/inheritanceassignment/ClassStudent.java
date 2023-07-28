package inheritanceassignment;

public class ClassStudent extends ClassEmploy {
String s= "Student of Java class";
public void studDetails()
{
	System.out.println(s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassStudent obj1 = new ClassStudent();
		obj1.studDetails();
		obj1.employDetails();
	}

}
