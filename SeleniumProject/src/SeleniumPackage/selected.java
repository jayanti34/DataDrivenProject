package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selected {



		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/radio.html");
		
			driver.manage().window().maximize();
			WebElement radiobutton = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
	radiobutton.click();
	Thread.sleep(2000);
	if(radiobutton.isSelected()) {
		System.out.println("radio selected");
	}
driver.close();
	}

}
