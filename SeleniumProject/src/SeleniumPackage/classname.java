package SeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class classname {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://omayo.blogspot.com/");
			driver.manage().window().maximize();
			WebElement element = driver.findElement(By.className("classone"));
			Thread.sleep(5000);
			element.sendKeys("abcd");
		

		}

	}

	

	


