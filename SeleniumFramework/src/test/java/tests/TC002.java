package tests;

import org.testng.annotations.Test;
import driver.DriverManager;

public final class TC002 extends BaseTest {
	private TC002() {
	}

	@Test
	public void testSecond() {
		String title = DriverManager.getDriver().getTitle();
		System.out.println(title + " for test 2");
	}

}
