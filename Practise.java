package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.stylesheets.LinkStyle;

public class Practise {

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
		 List<WebElement> options = sct.getAllSelectedOptions();
		 for(int i = 0; i<options.size();i++)
		 { 
			 WebElement option = options.get(i);
			 String text = option.getText();
			 System.out.println(text);
		 }
		 c.close();

	}
}
