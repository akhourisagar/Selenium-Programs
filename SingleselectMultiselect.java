package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleselectMultiselect {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("file:///C:/Users/prakasas/html/test_page%20(2).html");
		 WebElement ddl = c.findElement(By.xpath("(//select)[2]"));
		 Select  sct = new Select(ddl);
		 boolean status = sct.isMultiple();
		 if(status ==true)
			 System.out.println("Multi Select");
		 else 
			 System.out.println("single select");
			 c.close();
			 
			 
			 
}
}
