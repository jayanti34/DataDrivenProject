package SeleniumPackage;
import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class findheightweight {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
        org.openqa.selenium.Dimension d = driver.findElement(By.id("but2")).getSize();
	System.out.println("height:"+d.height);
	System.out.println("width:"+d.width);
	driver.quit();

	}
	}

