package first;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Static_wait {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
			 WebDriver c = new ChromeDriver();
			 c.manage().window().maximize();
			 c.get("https://www.google.com");
			 c.findElement(By.id("lst-ib")).sendKeys("java",Keys.ENTER);
			 Thread.sleep(4000);
			 c.findElement(By.linkText("Download Free Java Software")).click();
			 Thread.sleep(4000);
			 c.findElement(By.linkText("Download")).click();
			 Thread.sleep(4000);
			 c.findElement(By.linkText("What is Java?")).click();
			 Thread.sleep(4000);
			 String title = c.getTitle();
			 System.out.println(title);
			  
		}
	}
