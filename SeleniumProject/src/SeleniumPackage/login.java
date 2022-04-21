package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/v4/");
			
			WebElement userId = driver.findElement(By.xpath("//input[@name='uid']"));
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
			
			userId.sendKeys("mngr396496");
			userId.clear();
			Thread.sleep(2000);
			password.sendKeys("rEvyvuh");
			login.click();
			driver.close();

	}

}
