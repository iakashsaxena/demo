package javatest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorld {
	@Test(priority=1)

	public void z()
	{
		System.out.println("Hello World");
	}
	@BeforeTest

	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@Test(priority=3)

	public void x()
	{
		System.out.println("Hello World2");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	@Test(priority=4)

	public void w()
	{
		System.out.println("Hello World3");
	}
}

