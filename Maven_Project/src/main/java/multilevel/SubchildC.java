package multilevel;

public class SubchildC extends ChildB
{

	public void three()
	{
		System.out.println("This is sub child class");
	}
	public static void main(String[] args) 
	{
		SubchildC su = new SubchildC();
		su.one();
		su.two();
		su.three();
		
	}

}
