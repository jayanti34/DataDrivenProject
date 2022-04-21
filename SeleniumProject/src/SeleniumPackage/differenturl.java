package SeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class differenturl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
String url1 = driver.getCurrentUrl();
System.out.println("Url of the page:"+url1);
driver.findElement(By.linkText("compendiumdev")).click();
String url2 = driver.getCurrentUrl();
System.out.println("Url of the page:"+url2);
driver.quit();
	

	}

}
