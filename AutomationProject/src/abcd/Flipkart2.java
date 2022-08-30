package TestNg_Proj;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart2
{
	@Test
	public void login()
	{
		System.out.println("login to the app");
	}
	@Test
	public void selectProduct()
	{
		Assert.fail();
		System.out.println("select the product");
	}
	@Test(dependsOnMethods="selectProduct")
	public void addToCart()
	{
		System.out.println("add to the cart");
	}
	@Test(dependsOnMethods="addToCart")
	public void doPayment()
	{
		System.out.println("do the payment");
	}
}
