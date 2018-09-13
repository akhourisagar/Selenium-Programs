package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.stylesheets.LinkStyle;
public class DDLallAvailableOptions {

		public static void main(String[] args)  {
			System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
			 WebDriver c = new ChromeDriver();
			 c.manage().window().maximize();
			 c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 c.get("https://www.facebook.com");
			 c.manage().window().maximize();
			WebElement yearDDL= c.findElement(By.id("year"));
			Select yearSlc=new Select(yearDDL);
			List<WebElement> options = yearSlc.getOptions();
			for (int i=0;i<options.size();i++)
			{
				 WebElement option = options.get(i);
				 System.out.println(option);
				
			}
		}
	}

