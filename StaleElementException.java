package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("https://www.google.com");
	 WebElement searchTextbox = c.findElement(By.id("lst-ib")); 
	 Thread.sleep(1000);
	 c.navigate().refresh();
	 //solution is below - To re identify the element by passing the reference again 
	 searchTextbox = c.findElement(By.id("lst-ib")); 
	 searchTextbox.sendKeys("Java");
	 Thread.sleep(1000);
	 c.close();
}
}
