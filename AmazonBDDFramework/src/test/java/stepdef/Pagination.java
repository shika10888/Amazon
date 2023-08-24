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

public class Pagination {
	WebDriver driver = DriverUtil.getDriver();
	@Given("User must be on User accountpage.")
	public void user_must_be_on_user_accountpage() {
		
	}

	@When("User must enter any keyword.")
	public void user_must_enter_any_keyword() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women handbags");
	}

	@When("Click on search button")
	public void click_on_search_button() {
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().window().maximize();
	}

	@Then("Only {int} items must be displayed per page.")
	public void only_items_must_be_displayed_per_page(Integer int1) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]"))).isDisplayed();
		
	}

	


}
