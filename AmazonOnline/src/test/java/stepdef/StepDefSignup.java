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


public class StepDefSignup {
	WebDriver driver = new ChromeDriver();
	
	@Given("User must be on Homepage by clicking url {string}")
	public void user_must_be_on_homepage_by_clicking_url(String string) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get(string);
	}

	@When("User clicks on Start Here Button")
	public void user_clicks_on_start_here_button() {
		Actions actions= new Actions(driver);
		   actions.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		   driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
	}

	@Then("Create Account dialogbox must be displayed.")
	public void create_account_dialogbox_must_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ap_register_form > div > div > h1"))).isDisplayed();
	}

	@Then("Enter valid Your name , Mobile number or Email , Password and Password Again on Create Account form")
	public void enter_valid_your_name_mobile_number_or_email_password_and_password_again_on_create_account_form() {
		driver.findElement(By.id("ap_customer_name")).sendKeys("Amy");
		   driver.findElement(By.id("ap_email")).sendKeys("shika10888+1@gmail.com");
		   driver.findElement(By.id("ap_password")).sendKeys("abcdef");
		   driver.findElement(By.id("ap_password_check")).sendKeys("abcdef");
	}

	@Then("Click on Continue Button")
	public void click_on_continue_button() {
		driver.findElement(By.id("continue")).click();
	}
}




