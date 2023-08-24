package stepdef;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testrunner.DriverUtil;

public class Sorting {
	WebDriver driver = DriverUtil.getDriver();
	@Given("User should be on User Account Page")
	public void user_should_be_on_user_account_page() {
		
	}

	@When("User enters any keyword.Click on Search")
	public void user_enters_any_keyword_click_on_search() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women handbags");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@When("Click on Sort option & select price Low to high sorting criteria")
	public void click_on_sort_option_select_price_low_to_high_sorting_criteria() throws InterruptedException {
		

				List<WebElement> elements = driver.findElements(By.className("a-dropdown-label"));
				if (elements.size() > 1) {
					elements.get(1).click();
				} else {
					elements.get(0).click();
				}
				Thread.sleep(Duration.ofSeconds(10));
		driver.findElement(By.id("s-result-sort-select_1")).click();
	}

	@Then("Items with the least price must be displayed first followed by items of higher price.")
	public void items_with_the_least_price_must_be_displayed_first_followed_by_items_of_higher_price() {
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]")).getAttribute("class").contains("a-dropdown-link"));
	}




}
