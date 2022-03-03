package tests;

import org.testng.annotations.Test;
import driver.DriverManager;

public final class TC001 extends BaseTest{
	private TC001() {}
	
	@Test
	public void testFirst() {
		String title= DriverManager.getDriver().getTitle();
		System.out.println(title);
	}
	
	

}
