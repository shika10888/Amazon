package stepdef;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class Yourpayments {
	WebDriver driver=DriverUtil.getDriver();
	@Given("User must be on his \\/her account homepage.Click on Login Message")
	public void user_must_be_on_his_her_account_homepage_click_on_login_message() {
	
		   driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	}

	
	@When("On Clicking on Your payments option.")
	public void on_clicking_on_your_payments_option() {
		Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofMillis(10))
				.ignoring(NoSuchElementException.class);
				wait2.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2"))));
	    driver.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
	   
	}
	@Then("User must be able must navigate to Add Payment method.")
	public void user_must_be_able_must_navigate_to_add_payment_method() {
		Wait<WebDriver> wait3=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(10))
				.ignoring(NoSuchElementException.class);

				wait3.until((ExpectedConditions.visibilityOfElementLocated(By.className("a-button-input"))));
	    driver.findElement(By.className("a-button-input")).click();
	}    
	}
	