package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPageObjects {

	WebDriver driver;

	public DashboardPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By dashboard = By.xpath("//h6[text()='Dashboard']");
	By dropDownLogout = By.xpath("//p[@class='oxd-userdropdown-name']");
	By logoutBtn = By.xpath("//a[normalize-space()='Logout']");

	public void verifyDashboard() {
		WebElement dashboard2 = driver.findElement(By.xpath("/h6[text()='Dashboard']"));
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

}
