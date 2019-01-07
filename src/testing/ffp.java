package testing;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ffp {
	String actualTitle= "Akash";
	String acceptedTitle="Saxena";
	
	@Test
	public void MEthod1() {
		
	
	System.out.println("Before Assert");
	Assert.assertEquals(actualTitle, acceptedTitle);
	System.out.println("After Assert");

	}
	@Test
	public void test1() {
		
		
		System.out.println("Fourth test");
		}
	
	
	

}