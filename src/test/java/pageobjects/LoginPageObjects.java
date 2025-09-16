package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObjects {
	//

	// in this class we are storing the webelements
	// and also storing the interactions with webelements

	WebDriver driver;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	private By username = By.xpath("//input[@name=\"username\"]");
	private By password = By.xpath("//input[@name=\"password\"]");
	private By loginBtn = By.xpath("//button[@type='submit']");

	public void setUsername(String x) {
		WebElement usernameTxtbox = driver.findElement(By.name("username"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(usernameTxtbox));
		driver.findElement(username).sendKeys(x);
	}

	public void setPwd(String x) {
		driver.findElement(password).sendKeys(x);
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

}
