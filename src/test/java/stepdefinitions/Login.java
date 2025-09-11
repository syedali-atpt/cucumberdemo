//package stepdefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Login {
//
//	WebDriver driver;
//	WebElement dashboard;
//
//	@Given("User should open chrome browser")
//	public void user_should_open_chrome_browser() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\Cucumber\\src\\test\\resources\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
////		WebDriverManager.chromedriver().setup();
////		WebDriverManager.firefoxdriver().setup();
//
//	}
//
//	@Given("User should be navigated to orange hrm launch page")
//	public void user_should_be_navigated_to_orange_hrm_launch_page() throws InterruptedException {
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);
//	}
//
//	@When("User enters valid username {string}")
//	public void user_enters_valid_username(String username) {
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//	}
//
//	@When("User enters valid password {string}")
//	public void user_enters_valid_password(String password) {
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//
//	}
//
//	@When("User click on login button")
//	public void user_click_on_login_button() throws InterruptedException {
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
//	}
//
//	@Then("User should navigate to dashboard page")
//	public void user_should_navigate_to_dashboard_page() {
//		dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
//		if(dashboard.isDisplayed()) {
//			System.out.println("User navigated successfully to dashboard");
//		}else {
//			System.out.println("User is on this page"+driver.getTitle());
//		}
//	}
//
//	@Then("User logout of app and close the chrome browser")
//	public void user_logout_of_app_and_close_the_chrome_browser() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@alt=\"profile picture\"][@class=\"oxd-userdropdown-img\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Logout")).click();
//		
//		driver.quit();
//
//	}
//
//}
