package driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

public final class Driver {
	private Driver() {}

	public static void initDriver() {
		if (Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver", "E:\\Marker\\Workspace\\Selenium Automation Framework\\SeleniumFramework\\src\\test\\resources\\chromedriver.exe");
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get("https://www.google.com");
		}

	}

	public static void tearDownDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().close();
			
		}

	}
}
