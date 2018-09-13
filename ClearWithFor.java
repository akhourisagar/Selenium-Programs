package first;
import java.awt.RenderingHints.Key;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
public class ClearWithFor {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
				 WebDriver c = new ChromeDriver();
				 c.manage().window().maximize();

				 c.get("https://www.google.com");
				// CharSequence input = "invalid";
				//element.sendKeys(input);
				 WebElement element = c.findElement(By.id("lst-ib"));
				 element.sendKeys("typing random");
				 String att = element.getAttribute("value");
				 Thread.sleep(10000);
				 for(int i = 0; i<att.length();i++)
				 {
					 element.sendKeys(Keys.BACK_SPACE);
				 }
				 c.close();
				 			}
		}

