package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\StudyMaterial\\SeleniumSoftware\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.id("u_0_j")).sendKeys("akash");
driver.findElement(By.id("u_0_l")).sendKeys("saxena");
driver.findElement(By.id("u_0_o")).sendKeys("8527375859");
driver.findElement(By.id("u_0_v")).sendKeys("akash1990");
driver.findElement(By.id("day")).sendKeys("7");
driver.findElement(By.id("month")).sendKeys("Sep");
driver.findElement(By.id("year")).sendKeys("1990");
driver.findElement(By.id("u_0_a")).click();
driver.findElement(By.id("u_0_11")).click();
//driver.findElement(By.linkText("Developers")).click();
	}

}
