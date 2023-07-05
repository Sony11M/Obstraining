package multilevel;

public class ChildB extends ParentA
{
	
	public void two()
	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) 
	{
		
		ChildB  ch = new ChildB();
       ch.one();
       ch.two();
	}

}
