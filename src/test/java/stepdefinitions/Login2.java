package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DashboardPageObjects;
import pageobjects.LoginPageObjects;

public class Login2 {

	WebDriver driver;
	WebElement dashboard;
	LoginPageObjects lo;
	DashboardPageObjects dp;

	@Given("User should open chrome browser")
	public void user_should_open_chrome_browser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\Cucumber\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();

	}

	@Given("User should be navigated to orange hrm launch page")
	public void user_should_be_navigated_to_orange_hrm_launch_page() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}

	@When("User enters valid username {string}")
	public void user_enters_valid_username(String username) {
		lo = new LoginPageObjects(driver);
		lo.setUsername(username);
	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String password) {
		lo.setPwd(password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		lo.clickLogin();
		Thread.sleep(5000);
	}

	@Then("User should navigate to dashboard page")
	public void user_should_navigate_to_dashboard_page() {
		dp = new DashboardPageObjects(driver);
		dp.verifyDashboard();
	}

	@Then("User logout of app and close the chrome browser")
	public void user_logout_of_app_and_close_the_chrome_browser() throws InterruptedException {
		Thread.sleep(2000);
		dp.clickLogout();
		driver.quit();

	}

}
