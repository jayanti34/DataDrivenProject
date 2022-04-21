package SeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class dispalyedbutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
    // boolean displayed = driver.findElement(By.id("hbutton")).isDisplayed();
	    // System.out.println(displayed);
		//boolean enabled = driver.findElement(By.id("but1")).isEnabled();
	    //System.out.println(enabled);
		boolean selected = driver.findElement(By.id("checkbox1")).isSelected();
	    System.out.println(selected);
		
		
	driver.quit();
		

	}

}
