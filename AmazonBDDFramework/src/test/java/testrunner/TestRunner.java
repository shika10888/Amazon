package testrunner;

import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\alvin\\eclipse-workspace\\AmazonOnline\\src\\test\\java\\feature", glue= {"stepdef"}, tags = "@signed_in")
public class TestRunner {
	
	@BeforeClass
	public static void setup() {
		DriverUtil.initialize();
		
	}
}
