package first;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getSize_getPosition {


		public static void main(String[] args) {
					System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
					WebDriver c = new ChromeDriver();
	 				 c.get("https://www.facebook.com");
	 				 Dimension dim = c.manage().window().getSize();
	 				 int height = dim.getHeight();
	 				 int width = dim.getWidth();
	 				 System.out.println("height and width = " +height +" and " +width );
	 				 
	 				 Point p= c.manage().window().getPosition();
	 				 int x= p.getX();
	 				 int y= p.getY();
	 				 System.out.println("position of x and y = "+x +"and "+y);
		}

	}
