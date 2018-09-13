package first;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Flipkart_Electronics_ClickOnSamsung {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
			 WebDriver c = new ChromeDriver();
			 c.manage().window().maximize();
			 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 c.get("https://www.flipkart.com");
			 WebElement element = c.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"));
			 Thread.sleep(4000);
			 Actions action = new Actions(c);
			 action.moveToElement(element).perform();
			 WebElement element2 = c.findElement(By.linkText("Samsung"));
			 WebDriverWait wait = new WebDriverWait(c, 30);
			 wait.until(ExpectedConditions.visibilityOf(element2));
			 element2.click();
		}
	}

