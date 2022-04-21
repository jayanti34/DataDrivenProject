package SeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class actionclass {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement sign=	driver.findElement(By.xpath("//[span@text()='Hello, Sign in']"));
	Actions holding=new Actions(driver);
	holding.moveToElement(sign).build().perform();
	Thread.sleep(2000);

	}

}
