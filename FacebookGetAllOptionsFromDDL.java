package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookGetAllOptionsFromDDL {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("https://www.facebook.com");
	 WebElement monthDDL = c.findElement(By.id("month"));
	 Select monthSct = new Select(monthDDL);
/*	List<WebElement> options  =   monthSct.getOptions();
	WebElement firstoption = options.get(0);
	String text = firstoption.getText();
	System.out.println(text);*/
	 
	 List<WebElement> options  =   monthSct.getOptions();
	 for(int i = 0;i<options.size();i++)
	 {
		WebElement firstoption = options.get(i);
		String text = firstoption.getText();
		System.out.println(text);
	 }
	 c.close();
}
}
