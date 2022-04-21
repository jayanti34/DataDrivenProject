package SeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Select dropdown=new Select(driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")));
		dropdown.selectByVisibleText("Apps & Games");
		//dropdown.selectByIndex(8);
		//dropdown.selectByValue("Computers & Accessories");
		Thread.sleep(2000);
		driver.close();

	}

}
