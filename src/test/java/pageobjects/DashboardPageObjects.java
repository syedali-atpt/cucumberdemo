package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPageObjects {

	WebDriver driver;

	public DashboardPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By dashboard = By.xpath("//h6[text()='Dashboard']");
	By dropDownLogout = By.xpath("//p[@class='oxd-userdropdown-name']");
	By logoutBtn = By.xpath("//a[normalize-space()='Logout']");
	By adminModule = By.xpath("//span[text()='Admin']");
	By systemUsers = By.xpath("//h5[text()='System Users']");

	public void verifyDashboard() {
		WebElement dashboard2 = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		if (dashboard2.isDisplayed()) {
			System.out.println("User navigated to dashboard page");
		} else {
			System.out.println("User navigated to some other page " + driver.getTitle());
		}
	}

	public void clickLogout() throws InterruptedException {
		driver.findElement(dropDownLogout).click();
		Thread.sleep(2000);
		driver.findElement(logoutBtn).click();
	}

	public void clickAdminModule() {
		WebElement adminModuleElement = driver.findElement(By.xpath("//span[text()='Admin']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(adminModuleElement));
		driver.findElement(adminModule).click();
	}

	public void verfiySystemUsers() throws InterruptedException {
		Thread.sleep(3000);
		WebElement systemUsers = driver.findElement(By.xpath("//h5[text()='System Users']"));
		if (systemUsers.isDisplayed()) {
			System.out.println("System Users Heading is displayed === Test Passed");
		}
	}

}
