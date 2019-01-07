
package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\StudyMaterial\\SeleniumSoftware\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
WebElement empid=driver.findElement(By.name("cusid"));
empid.sendKeys("12345");
WebElement button=driver.findElement(By.name("submit"));
button.click();
Alert obj=driver.switchTo().alert();
Thread.sleep(5000);
obj.accept();

System.out.println(obj.getText());
	}
}