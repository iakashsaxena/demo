package testing;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertDemoFailed {
	String actualTitle= "Akash";
	String acceptedTitle="Saxena";
	
	@Test
	public void MEthod1() {
		
	
	//System.out.println("Before Assert");
	Assert.assertEquals(actualTitle, acceptedTitle);
	//System.out.println("After Assert");

	}
	
	
	

}
