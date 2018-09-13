package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForward {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		 WebDriver c = new ChromeDriver();
		 c.navigate().to("https://www.facebook.com");
		 c.navigate().back();
		 Thread.sleep(1000);
		 c.navigate().forward();
		 c.navigate().refresh();
		 c.close();
	}

}
