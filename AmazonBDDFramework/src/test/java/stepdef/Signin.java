package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signin {
	WebDriver driver = new ChromeDriver();
	@Given("click on Sign in")
	public void click_on_sign_in() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.amazon.ca/");
		Actions actions= new Actions(driver);
		   actions.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		   driver.findElement(By.className("nav-action-inner")).click();
	}

	@When("Enter Valid Email or Mobile number")
	public void enter_valid_email_or_mobile_number() throws InterruptedException {
		Thread.sleep(30);
	    driver.findElement(By.id("ap_email")).sendKeys("shika10888+1@gmail.com");
	    
	}

	@When("click on continue Button")
	public void click_on_continue_button() throws InterruptedException {
		Thread.sleep(30);
	    driver.findElement(By.id("continue")).click();
	}

	@Then("User must be navigated to Password field")
	public void user_must_be_navigated_to_password_field() {
	   
	   driver.findElement(By.id("ap_password")).sendKeys("abcdef");
	   
	   
	}

	@Then("click on Sign in Button")
	public void click_on_sign_in_button() {
		driver.findElement(By.id("signInSubmit")).click();
		
	}




}
