//class right click
package first;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleRightClick {
	public static void main(String[] args) {
		
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("https://www.google.com");
	 WebElement gmailLink = c.findElement(By.linkText("Gmail"));
	 
	 Actions act = new Actions(c);
	 //act.contextClick(gmailLink).perform();
	 //to perform multiple action on an element 
	 act.contextClick(gmailLink).sendKeys("w").build().perform();
	 //act.doubleClick(gmailLink).perform();
	
	}
}