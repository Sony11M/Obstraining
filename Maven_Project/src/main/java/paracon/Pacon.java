package paracon;

public class Pacon 
{
	public Pacon(int a, String b)   // parameterised constructor
	{
		System.out.println();
		System.out.println(a);
		System.out.print(b);
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Pacon pa= new Pacon(10, "Sony");  //calling parameterised constructor.we can give any no.of stuednt details. need different object for each student 
		Pacon pc= new Pacon(20, "sul");

	}

}
