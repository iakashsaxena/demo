package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbTestng
{
	WebDriver driver;
	String url="https://www.facebook.com/";
	
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\StudyMaterial\\SeleniumSoftware\\chromedriverwin32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(url);
		
		
	}
	@Test
	public void Login()
	{
		driver.findElement(By.id("email")).sendKeys("akash@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("saxena");
		
	}
	@Test
	public void Signup()
	{
		driver.findElement(By.id("u_0_j")).sendKeys("akash");
		driver.findElement(By.id("u_0_l")).sendKeys("saxena");
		driver.findElement(By.id("u_0_o")).sendKeys("8527375859");
		driver.findElement(By.id("u_0_v")).sendKeys("akash1990");
		driver.findElement(By.id("day")).sendKeys("7");
		driver.findElement(By.id("month")).sendKeys("Sep");
		driver.findElement(By.id("year")).sendKeys("1990");
		driver.findElement(By.id("u_0_a")).click();
		driver.findElement(By.id("u_0_11")).click();
	
		
		
	}
	@AfterTest
	public void closeChrome()
	{
		driver.quit();
	}
	
	
}