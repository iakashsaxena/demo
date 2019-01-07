package testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptestdependsgroup {
	@Test
	public void test1() {
	System.out.println("first test");
	}
	@Test
	public void test2() throws Exception{
		System.out.println("Second test");
		throw new SkipException("message");
		}
	@Test(dependsOnMethods= "test2")
	public void test3() {
			System.out.println("Third test");
		}
	
}