package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.Driver;

public class BaseTest {
	
	protected BaseTest() {}
	
	
	@BeforeMethod
	public void setupDriver() {
		System.out.println("starting browser "+Thread.currentThread().getName());
		Driver.initDriver();
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDriver() {
		System.out.println("closing browser "+Thread.currentThread().getName());
		Driver.tearDownDriver();
	}

}
