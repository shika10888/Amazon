package stepdef;

import static org.junit.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testrunner.DriverUtil;

public class Filtration {
	WebDriver driver = DriverUtil.getDriver();
	@Given("User must enter any keyword.Click on search button")
	public void user_must_enter_any_keyword_click_on_search_button() {
		
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women handbags");
			driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@When("User selects any filter criteria")
	public void user_selects_any_filter_criteria() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_72/11192170011\"]/span/a/section/i"))).isDisplayed();
	    driver.findElement(By.xpath("//*[@id=\"p_72/11192170011\"]/span/a/section/i")).click();
	    WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_36/12035762011\"]/span/a/span"))).isDisplayed();
	    driver.findElement(By.xpath("//*[@id=\"p_36/12035762011\"]/span/a/span")).click();
    WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
	       wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_72/11192170011\"]/span/a/section/i"))).isDisplayed();
	}

	@Then("Items must be displayed according to the filter applied.")
	public void items_must_be_displayed_according_to_the_filter_applied() {
			assertTrue(driver.findElement(By.xpath("//*[@id=\"p_72/11192170011\"]/span/a/section/span")).getAttribute("class").contains("a-text-bold"));
	}
		
}
