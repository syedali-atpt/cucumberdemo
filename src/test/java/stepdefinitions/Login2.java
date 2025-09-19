package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.DashboardPageObjects;
import pageobjects.LoginPageObjects;
import utilities.TestContextSetup;

public class Login2 {

	WebDriver driver;
	WebElement dashboard;
	LoginPageObjects lo;
	DashboardPageObjects dp;
	TestContextSetup testContextSetup;

	public Login2(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Given("User should open chrome browser")
	public void user_should_open_chrome_browser() {
//		WebDriverManager.chromedriver().setup();
//		testContextSetup.driver = new ChromeDriver();
//		testContextSetup.testBase.WebDriverManager();
		testContextSetup.testBase.WebdriverManager();
	}

	@Given("User should be navigated to orange hrm launch page")
	public void user_should_be_navigated_to_orange_hrm_launch_page() throws InterruptedException {
		testContextSetup.driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}

	@When("^User enters valid username (.*)$")
	public void user_enters_valid_username(String username) {
//		lo = new LoginPageObjects(testContextSetup.driver);
		lo = testContextSetup.pageObjectManager.getLoginPageObjects();
		lo.setUsername(username);
	}

	@When("^User enters valid password (.*)$")
	public void user_enters_valid_password(String password) {
		lo.setPwd(password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		lo.clickLogin();
		Thread.sleep(5000);
	}

//	@Then("User should navigate to dashboard page")
//	public void user_should_navigate_to_dashboard_page() {
//		dp = new DashboardPageObjects(driver);
//		dp.verifyDashboard();
//	}
//
//	@Then("User logout of app and close the chrome browser")
//	public void user_logout_of_app_and_close_the_chrome_browser() throws InterruptedException {
//		Thread.sleep(2000);
//		dp.clickLogout();
//		driver.quit();
//
//	}
//
//	@Then("User click on Admin module")
//	public void user_click_on_admin_module() {
//		dp.clickAdminModule();
//	}
//
//	@Then("User verify System Users is displayed")
//	public void user_verify_system_users_is_displayed() throws InterruptedException {
//		dp.verfiySystemUsers();
//	}

}
