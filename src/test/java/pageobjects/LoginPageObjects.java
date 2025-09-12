package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	//
	
	// in this class we are storing the webelements 
	// and also storing the interactions with webelements

	WebDriver driver;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	private By username = By.xpath("//input[@placeholder='Username']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By loginBtn = By.xpath("//button[@type='submit']");
	

	public void setUsername(String x) {
		driver.findElement(username).sendKeys(x);
	}

	public void setPwd(String x) {
		driver.findElement(password).sendKeys(x);
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

}
