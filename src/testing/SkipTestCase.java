package testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {
	@Test
	public void test1() {
	System.out.println("first test");
	}
	@Test
	public void test2() throws Exception{
		System.out.println("Second test");
		throw new SkipException("message");
		}
	@Test
	public void test3() {
			System.out.println("Third test");
		}
	@Test
	public void test4() {
		
		
		System.out.println("Fourth test");
		}
	@Test
	public void test5() {
		
		
		System.out.println("Fifth test");
		}
}
