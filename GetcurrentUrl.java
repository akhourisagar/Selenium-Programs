package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentUrl {

	public static void main(String [] args)
	{
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		 WebDriver c = new ChromeDriver();
		 c.manage().window().maximize();
		 c.get("https://www.google.com");
		 String currentUrl= c.getCurrentUrl();
		 System.out.println(currentUrl);
		c.close();
	}
}
