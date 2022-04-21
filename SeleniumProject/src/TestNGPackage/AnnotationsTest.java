package TestNGPackage;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsTest {
@BeforeSuite
public void beforeSuiteTest() {
	System.out.println("This is before suite method");
}
@BeforeGroups("Smoke")
public void beforeGroupsTest() {
	System.out.println("This is before groups Method");
}

@AfterGroups("Smoke")
public void afterGroupsTest() {
	System.out.println("This is after groups Method");
}

  @Test(groups= {"Smoke","Regression"}) 
  public void c() {
	  System.out.println("this is a test c");
  }
  @Test(groups= {"Smoke"})
  public void a() {
	  System.out.println("this is a test a");
  }
  @Test(groups= {"Regression"})
  public void b() {
	  System.out.println("this is a test b");
  }
	  @AfterSuite
	  public void afterSuiteTest() {
		  System.out.println("This is after suite method");
	 
  }
}
