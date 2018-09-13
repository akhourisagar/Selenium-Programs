package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveAllLinkText {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("https://www.google.com");
	 List<WebElement> links = c.findElements(By.xpath("//a"));
	 for(int i = 0; i<links.size();i++)
	 {
		
		 WebElement link = links.get(i);
	 String linkText = link.getText();
	 System.out.println(linkText);
	 }
}
}
