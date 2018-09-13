package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class execute2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		 WebDriver c = new ChromeDriver();
		 c.manage().window().maximize();
		 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 c.get("https://www.facebook.com");
		 WebElement yearDDL = c.findElement(By.id("year"));
		 Select yearSct = new Select(yearDDL);
		List<WebElement> options =  yearSct.getOptions();
		for(int i = 0;i<options.size()-1;i++)
		{
			WebElement option = options.get(i);
			String text = option.getText();
			if(text.equals("1960"))
			{
				yearSct.selectByIndex(i);
			}
		}
	}
	}


