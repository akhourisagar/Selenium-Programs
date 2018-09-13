package first;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
 
public class Execute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		 WebDriver c = new ChromeDriver();
		 c.manage().window().maximize();
		 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 c.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		 c.manage().window().maximize();
		 WebElement source=c.findElement(By.xpath("//h1[text()= 'Block 1']"));
		 Point p1= source.getLocation();
		 int x1= p1.getX();
		 int y1 = p1.getY();
		 
		 System.out.println(x1);
		 System.out.println(y1);
		 
		 WebElement target=c.findElement(By.xpath("//h1[text()= 'Block 2']"));
		 Point p = target.getLocation();
		 int x = p.getX();
		 int y = p.getY();
		 System.out.println(x);
		 System.out.println(y);

		 Actions act = new Actions(c);
		 act.dragAndDropBy(source, x, (y-124)).perform();
 		  
		 Thread.sleep(1000);

 	}
}
