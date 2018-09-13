package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import net.bytebuddy.asm.Advice.Enter;

public class assignment {
public static void main(String[] args) {
	
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("https://www.google.com");
	 WebElement searchTextbox = c.findElement(By.id("lst-ib")); 
	 searchTextbox.sendKeys("Java");
	 searchTextbox.sendKeys(Keys.ENTER);
	  List<WebElement> link = c.findElements(By.partialLinkText("Java"));
	  for (int i=0;i<link.size();i++)
	  {
		  
			  WebElement flink = link.get(i);
		  flink.click();
	  String title = c.getTitle();
	 System.out.println(title); 
	 c.navigate().back();
	  }
	  
	 c.close();
	 
}
}
