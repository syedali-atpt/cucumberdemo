package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import pageobjects.DashboardPageObjects;
import pageobjects.LoginPageObjects;
import utilities.TestContextSetup;

public class DashBoardSteps {

	WebDriver driver;
	WebElement dashboard;
	DashboardPageObjects dp;
	TestContextSetup testContextSetup;

	public DashBoardSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("User should navigate to dashboard page")
	public void user_should_navigate_to_dashboard_page() {
//		dp = new DashboardPageObjects(testContextSetup.driver);
		dp = testContextSetup.pageObjectManager.getDashboardPageObjects(); 
		dp.verifyDashboard();
	}

	@Then("User logout of app and close the chrome browser")
	public void user_logout_of_app_and_close_the_chrome_browser() throws InterruptedException {
		Thread.sleep(2000);
		dp.clickLogout();
		testContextSetup.driver.quit();

	}

	@Then("User click on Admin module")
	public void user_click_on_admin_module() {
		dp.clickAdminModule();
	}

	@Then("User verify System Users is displayed")
	public void user_verify_system_users_is_displayed() throws InterruptedException {
		dp.verfiySystemUsers();
		testContextSetup.driver.quit();
	}
}
