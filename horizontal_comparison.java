package first;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class horizontal_comparison {


		public static void main(String[] args) {
			System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
			 WebDriver c = new ChromeDriver();
			 c.manage().window().maximize();
			 c.get("https://www.facebook.com");
			 WebElement element = c.findElement(By.id("email"));
			 Point p= element.getLocation();
			 int w1=p.getY();//since x values will change but not y 
			 WebElement element2 = c.findElement(By.id("pass"));
			 Point p2 = element2.getLocation();
			 int w2 = p2.getY();
			  
			 if(w1 == w2)
			 {
				 System.out.println("pass");
				 
			 }
			 else
				 System.out.println("fail");
			  
		}
	}

