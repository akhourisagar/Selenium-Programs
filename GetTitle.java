package first;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTitle {
		public static void main(String[] args) {
					System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
					 WebDriver c = new ChromeDriver();
					 c.manage().window().maximize();
					 c.get("https://www.facebook.com");
					 String Title_of_web_page= c.getTitle();
					 System.out.println(Title_of_web_page);
	 				 c.close();
		}

	}
