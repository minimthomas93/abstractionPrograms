package abstractionPrograms;

public class AbstractMainClass {

	public static void main(String[] args) 
	{

		AbstractImplementation obj=new AbstractImplementation();
		obj.process();
		obj.setUp();
		obj.tearDown();
	}

}
