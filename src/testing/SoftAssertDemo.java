package testing;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertDemo 
{
	String actualTitle= "Akash";
	String axpectedTitle="Saxena";
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void Method1() {
		
	
	System.out.println("Before Assert");
	softassert.assertEquals(actualTitle, axpectedTitle);
	System.out.println("After Assert");
	softassert.assertAll();

	}
	
	
	

}
