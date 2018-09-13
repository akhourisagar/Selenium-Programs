package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		 WebDriver c = new ChromeDriver();
		 c.manage().window().maximize();
		 c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 c.get("file:///C:/Users/prakasas/html/test_page%20(2).html");
		 c.manage().window().maximize();
		 c.get("file:///C:/Users/prakasas/html/test_page%20(2).html");
		 WebElement ddl = c.findElement(By.xpath("(//select)[2]"));
		 Select  sct = new Select(ddl);
		 sct.selectByIndex(0);
		 sct.selectByValue("saab");
		 sct.selectByVisibleText("maruti");
		 Thread.sleep(1000);
		// sct.deselectByIndex(0);
		 sct.deselectAll();
	}
}
