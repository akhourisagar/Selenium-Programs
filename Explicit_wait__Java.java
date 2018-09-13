package first;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//how is this displaying the  same thing ,with  or without the  implicit and explicit wait
//when do we use static wait and implicit and explicit wait 

public class Explicit_wait__Java {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
			 WebDriver c = new ChromeDriver();
			 c.manage().window().maximize();
			 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 c.get("https://www.google.com");
			 c.findElement(By.id("lst-ib")).sendKeys("java" , Keys.ENTER);
			 c.findElement(By.linkText("Download Free Java Software")).click();
			 WebDriverWait wait = new WebDriverWait(c, 30);
		     wait.until(ExpectedConditions.titleIs("Download Free Java Software"));

		     String title =  c.getTitle();
			 System.out.println(title);
		}
	}

