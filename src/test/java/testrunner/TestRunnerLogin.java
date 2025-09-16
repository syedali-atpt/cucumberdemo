package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Syed Murthuza Ali\\eclipse-workspace\\AutomationFrameworks\\Cucumber\\src\\test\\resources\\Features\\login2.feature",
		glue = "stepdefinitions",
		plugin = {"pretty", "html:target/htmlreport/report.html" },
//		dryRun = false
		monochrome = true
//		tags = "@Smoke"

)	

public class TestRunnerLogin {

}
