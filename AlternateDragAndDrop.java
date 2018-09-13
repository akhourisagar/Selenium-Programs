package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlternateDragAndDrop {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	 WebElement source = c.findElement(By.xpath("//h1[text() = 'Block 1']"));
	 
	 WebElement target = c.findElement(By.xpath("//h1[text() = 'Block 4']"));
	 
	 Actions act = new Actions(c);
	 act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
}
}
