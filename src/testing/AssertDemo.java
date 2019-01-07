package testing;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertDemo {
	String actualTitle= "Akash";
	String acceptedTitle="Akash";
	
	@Test
	public void MEthod1() {
		
	
	System.out.println("Before Assert");
	Assert.assertEquals(actualTitle, acceptedTitle);
	System.out.println("After Assert");

	}
	
	
	

}
