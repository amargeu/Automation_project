package TestNg_Proj;

import org.testng.annotations.Test;

public class Test_2 
{
	@Test(invocationCount=4)///execute 4 times
	public void a()
	{
		System.out.println("the demo method a");
	}
	
	//disable test script
	@Test(invocationCount=0)
	public void b()
	{
		System.out.println("the demo method a");
	}
	
}
