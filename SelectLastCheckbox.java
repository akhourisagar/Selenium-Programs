package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectLastCheckbox {
	public static void main(String[] args) {
		
	
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("file:///C:/Users/prakasas/html/test_page%20(2).html");
	 List<WebElement> checkboxes = c.findElements(By.xpath("//input[@type = 'checkbox']"));
	 int size = checkboxes.size();
	 WebElement lastCheckbox = checkboxes.get(size-1);
	 lastCheckbox.click();
	}
}
