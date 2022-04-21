package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Script {
	@BeforeClass
	public void beforeClassTest() {
		System.out.println("This is before class method");
	}
	@AfterClass
	public void afterClassTest() {
		System.out.println("This is after class method");
	}
  @Test(priority=0)
  public void firstmethod() {
	  System.out.println("This is first method");
  }
  @Test(priority=1)
  public void secondtmethod() {
	  System.out.println("This is second method");
  }
  @Test(priority=2)
  public void thirdmethod() {
	  System.out.println("This is third method");
  }
  @Test(priority=3)
  public void fourthmethod() {
	  System.out.println("This is fourth method");
  }
  @Test(priority=4)
  public void fifthmethod() {
	  System.out.println("This is fifth method");
  }
}

