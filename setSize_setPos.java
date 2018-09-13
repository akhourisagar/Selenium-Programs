package first;

import java.awt.Dimension;
import java.sql.Driver;

import javax.swing.text.Position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class setSize_setPos {

		public static void main(String[] args) {
					System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
					WebDriver c = new ChromeDriver();
	 				 org.openqa.selenium.Dimension dim = new org.openqa.selenium.Dimension(100, 100);
	 				 c.manage().window().setSize(dim);
	 				 Point p = new Point(80, 80);
	 				 c.manage().window().setPosition(p);
	 				 c.get("https:www.facebook.com");

	 				 c.close();
		}

	}

