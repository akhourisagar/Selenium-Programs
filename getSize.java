package first;
import java.awt.Dimension;
import java.sql.Driver;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getSize {
	

		public static void main(String[] args) {
					System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
					WebDriver c = new ChromeDriver();
	 				c.manage().window().maximize();
	 				c.get("https://www.facebook.com");
	 				org.openqa.selenium.Dimension size = c.manage().window().getSize();
	 				System.out.println(size);
	 			int height = size.getHeight();
	 				int width= size.getWidth();
	 				System.out.println("height is "+height);
	 				System.out.println("Width is "+width);
	 				
	 				c.close();					
		}

	}
