package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IrctcLaunch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\StudyMaterial\\SeleniumSoftware\\chromedriverwin32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //miximize the chrome window
driver.get("https://www.irctc.co.in/nget/train-search");
//Thread.sleep(5000);
  WebElement element=driver.findElement(By.cssSelector("body > app-root > app-home > app-header > div.h_container > div.h_main_div > div.h_head2 > nav > ul > li:nth-child(6) > a"));
Actions actions=new Actions(driver);
actions.moveToElement(element).build().perform();
WebElement element1=driver.findElement(By.xpath("/html/body/app-root/app-home/app-header/div[2]/div[2]/div[2]/nav/ul/li[6]/ul/li[2]/a/span"));
	element.click();  


   


	driver.quit();
	}
}
