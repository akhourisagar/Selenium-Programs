package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOBfacebook {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("https://www.facebook.com");
	 WebElement monthDDL = c.findElement(By.id("month"));
	 Select monthSct = new Select(monthDDL);
	 monthSct.selectByIndex(11);
	 
	 WebElement dayDDL = c.findElement(By.id("day"));
	 Select daySct = new Select(dayDDL);
	 daySct.selectByValue("16");
	 
	 WebElement yearDDL = c.findElement(By.id("year"));
	 Select yearSct = new Select(yearDDL);
	 yearSct.selectByVisibleText("1989");
}
}
