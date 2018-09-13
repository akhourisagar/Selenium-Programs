package first;
import java.awt.Dimension;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class setSize {
		public static void main(String[] args) {
					System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
					WebDriver c = new ChromeDriver();
	 				//c.manage().window().maximize();
	 				c.get("https://www.facebook.com");
	org.openqa.selenium.Dimension size = new org.openqa.selenium.Dimension(10000, 500);
	 				c.manage().window().setSize(size);
	 				c.close();
					
		}

	}

