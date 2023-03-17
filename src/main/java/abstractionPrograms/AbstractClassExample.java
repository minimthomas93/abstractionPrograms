package abstractionPrograms;

public abstract class AbstractClassExample 		//abstract class
{

	public void setUp()		//non abstract method
	{
		System.out.println("This is non abstract method setup");
	}
	
	public void tearDown()	//non abstract method
	{
		System.out.println("This is non abstract method teardown");
	}
	
	public abstract void process();	//abstract method- no body
	
}
