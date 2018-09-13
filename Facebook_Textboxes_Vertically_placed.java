package first;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
public class Facebook_Textboxes_Vertically_placed {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
			 WebDriver c = new ChromeDriver();
			 c.manage().window().maximize();
			 c.get("https://www.facebook.com");
			WebElement email =  c.findElement(By.id("u_0_n"));
			 Point emailLocation = email.getLocation();
			 int x = emailLocation.getX();
			 System.out.println(x);
			 
			 WebElement password =  c.findElement(By.id("u_0_z"));
			 Point passwordLocation = password.getLocation();
			  int x1 = passwordLocation.getX();
			  System.out.println(x1);
			  if(x==x1)
			  {
				  System.out.println("the textboxes are vertically placed");
			  }
			  else
				  System.out.println("they are horizontally placed");
		}
	}

