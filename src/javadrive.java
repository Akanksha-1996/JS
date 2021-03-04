 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javadrive {
	static
	  {
	   System.setProperty("webdriver.chrome.driver", "C:/program/JavaDriver/driver");
	  }
public static void main(String[] args) throws IllegalStateException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");		
		
	}
}
