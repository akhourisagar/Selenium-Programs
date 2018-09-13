package first;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailPerformLogin {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
			 WebDriver c = new ChromeDriver();
			 c.manage().window().maximize();
			 c.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
			 c.findElement(By.id("identifierId")).sendKeys("sagareverse@gmail.com", Keys.ENTER);
			 Thread.sleep(1000);
			 c.findElement(By.name("password")).sendKeys("password" , Keys.ENTER);
			 
		}

	}

