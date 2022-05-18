package pages;

import org.openqa.selenium.By;

import driver.DriverManager;

public final class GoogleHomePage {
	
	private final By textSearchField = By.id("input");
	private final By linkGmail = By.xpath("//a[contains(text(),'Gmail')]");
	
	
	public void verifyLink() {
		DriverManager.getDriver().findElement(linkGmail).isDisplayed();
		
	}
	
	public void searchKeyword(String input) {
		DriverManager.getDriver().findElement(textSearchField).sendKeys(input);
		
	}

}
