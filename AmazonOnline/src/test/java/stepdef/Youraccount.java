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

public class Youraccount {
	WebDriver driver = new ChromeDriver();
	@Given("click on Signin")
	public void click_on_signin() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.amazon.ca/");
		Actions actions= new Actions(driver);
		   actions.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		   driver.findElement(By.className("nav-action-inner")).click();
	}
	@When("Enter Email or Mobile number and Password")
	public void enter_email_or_mobile_number_and_password() {
		driver.findElement(By.id("ap_email")).sendKeys("shika10888+1@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("abcdef");
	}

	@When("click on Signin Button")
	public void click_on_signin_button() {
		driver.findElement(By.id("signInSubmit")).click();
	}
	

	
	@Then("Login message should be displayed as {string}")
	public void login_message_should_be_displayed_as(String string) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList"))).isDisplayed();
		  

	    
	}

}
