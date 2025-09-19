package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public LoginPageObjects loginPageObjects;
	public DashboardPageObjects dashBoardPageObjects;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPageObjects getLoginPageObjects() {
		if (loginPageObjects == null) {
			loginPageObjects = new LoginPageObjects(driver);
		}
		return loginPageObjects;
	}

	public DashboardPageObjects getDashboardPageObjects() {
		if (dashBoardPageObjects == null) {
			dashBoardPageObjects = new DashboardPageObjects(driver);
		}
		return dashBoardPageObjects;
	}

}
