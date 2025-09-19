package utilities;

import org.openqa.selenium.WebDriver;

import pageobjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;

	public TestContextSetup() {
		testBase = new TestBase();
		driver = testBase.WebdriverManager();
		pageObjectManager = new PageObjectManager(driver);
	}

}
