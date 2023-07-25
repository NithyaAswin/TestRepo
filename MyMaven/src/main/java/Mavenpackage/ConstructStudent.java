package Mavenpackage;

public class ConstructStudent
		{
		String name;//instance variables
		int age;//instance variables

		public ConstructStudent(String name,int age)
		{
		  this.name = name;
		  this.age = age;
		  
		}
		public void print()
		{
		System.out.println(name);
		System.out.println(age);
		}

		public static void main(String args[])

		{
		  ConstructStudent s1 = new ConstructStudent("Nija",30);
		  s1.print();
		  
		  ConstructStudent s2 = new ConstructStudent("Neethu",32);
		  s2.print();
		}

		}