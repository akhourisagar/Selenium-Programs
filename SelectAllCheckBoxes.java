package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxes {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("file:///C:/Users/prakasas/html/test_page%20(2).html");
	 List<WebElement> checkboxes = c.findElements(By.xpath("//input[@type = 'checkbox']"));
	 for (int i = 0;i<checkboxes.size();i++)
	 {
		 WebElement checkbox = checkboxes.get(i);
				 boolean status = checkbox.isSelected();
		 if(status == false )
		 {
			 checkbox.click();
		 }
	 }
}
}
