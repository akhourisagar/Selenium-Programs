package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindowInSelenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
	 WebDriver c = new ChromeDriver();
	 c.manage().window().maximize();
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c.get("https://www.flipkart.com");
	 String js_command = "window.scroll(0, 5000)";
	 JavascriptExecutor js_driver = (JavascriptExecutor) c ;
	 js_driver.executeScript(js_command);
	 Thread.sleep(1000);
}
}
