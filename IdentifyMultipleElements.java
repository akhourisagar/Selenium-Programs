package first;
import java.util.List;
//goto goole,identify all links,and display 1st linktext
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyMultipleElements {
	public static void main(String[] args) {
		
	
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("https://www.google.com");
	 List<WebElement> links = c.findElements(By.xpath("//a"));
	 WebElement FirstLink = links.get(0);
	 String linkText = FirstLink.getText();
	 System.out.println(linkText);
	}
}
