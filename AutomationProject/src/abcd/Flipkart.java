package TestNg_Proj;

import org.testng.annotations.Test;

public class Flipkart
{
	@Test(priority=0)
	public void login()
	{
		System.out.println("login to the app");
	}
	@Test(priority=3)
	public void addToCart()
	{
		System.out.println("add to the cart");
	}

	@Test(priority=2)
	public void selectProduct()
	{
		System.out.println("select the product");
	}
	
	@Test(priority=4)
	public void doPayment()
	{
		System.out.println("do the payment");
	}
}
