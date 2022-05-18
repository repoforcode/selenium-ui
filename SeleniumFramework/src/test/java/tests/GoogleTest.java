package tests;

import org.testng.annotations.Test;

import pages.GoogleHomePage;

public class GoogleTest extends BaseTest{
	
	@Test
	public void validateGmailLink() {
		GoogleHomePage googleHomePage = new GoogleHomePage();
		googleHomePage.verifyLink();
	}
	
	@Test
	public void validateSearchOperation() {
		GoogleHomePage googleHomePage = new GoogleHomePage();
		googleHomePage.searchKeyword("automation");
	}

}
