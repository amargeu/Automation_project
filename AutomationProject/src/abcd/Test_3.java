package TestNg_Proj;

import org.testng.annotations.Test;

public class Test_3 
{
@Test
	public void a()
	{
		System.out.println("the demo method a");
	}
	
	/*//disable test script
	@Test(invocationCount=0)
	public void b()
	{
		System.out.println("the demo method a");
	}*/
	@Test(enabled=false)
	public void c()
	{
		System.out.println("the demo method a");
	}
	
}
