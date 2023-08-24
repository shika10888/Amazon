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


public class Shoppingcart {
	WebDriver driver= DriverUtil.getDriver();
	@Given("User must enter any keyword or partial item text.Click on search button")
	public void user_must_enter_any_keyword_or_partial_item_text_click_on_search_button() {
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women handbags");
		   driver.manage().window().maximize();
		   WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-submit-button"))).isDisplayed();
			driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@When("Select any item and add it to cart")
	public void select_any_item_and_add_it_to_cart() {
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("s-image"))).isDisplayed();
	    driver.findElement(By.className("s-image")).click();
	    WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button"))).isDisplayed();
	    driver.findElement(By.id("add-to-cart-button")).click();
	}

	@Then("The cart must be updated with the added items.")
	public void the_cart_must_be_updated_with_the_added_items() throws InterruptedException {
	    
	    driver.findElement(By.id("nav-cart-count")).click();
	    Thread.sleep(30);
	    driver.findElement(By.className("sc-list-item-content")).isDisplayed();
	    
	   
	}



}
