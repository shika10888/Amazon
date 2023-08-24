package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testrunner.DriverUtil;

public class Searching {
	WebDriver driver = DriverUtil.getDriver();
	@Given("User must be on User Homepage")
	public void user_must_be_on_user_homepage() {
		
		
	}

	@When("User enters any keyword")
	public void user_enters_any_keyword() {
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women handbags");
	}

	@When("click on search button")
	public void click_on_search_button() {
	    driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("User must be directed to search result page")
	public void user_must_be_directed_to_search_result_page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("s-no-outline"))).isDisplayed();
		  
	}



}
