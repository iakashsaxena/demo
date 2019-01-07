package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\StudyMaterial\\SeleniumSoftware\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //miximize the chrome window
driver.get("https://www.facebook.com/");
List <WebElement>list=driver.findElements(By.tagName("a")); // for Finding list of desired tags
	System.out.println("Links counts are:"+list.size()); //Number of tags
	for(WebElement links:list)
	{	System.out.println(links.getText());
		System.out.println(links.getAttribute("href"));
	
	
	//System.out.println(title); //for title of page
	}
	driver.quit();
	
	}

}
