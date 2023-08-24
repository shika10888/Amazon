package testLayer;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import basePackage.BaseAmazonClass;
import pom.PomCreateAccountForm;
import utility.DriverUtil;


public class CreateAccountFormTest extends BaseAmazonClass {

  PomCreateAccountForm accountform;
  WebDriver driver;

  public CreateAccountFormTest() {
    super();
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
  }


  @BeforeMethod
  public void initsetup() {
    accountform = new PomCreateAccountForm();
    accountform.mousehover();
    accountform.clickstarthere();
  }


  @Test
  public void signup_should_pass_on_valid_entry() {
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofMillis(10)).ignoring(NoSuchElementException.class);

    wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("ap_customer_name"))));

    accountform.typeYourname(prop.getProperty("Yourname"));
    accountform.typeEmail(prop.getProperty("Email"));
    accountform.typePassword(prop.getProperty("Password"));
    accountform.typePasswordAgain(prop.getProperty("PasswordAgain"));
    accountform.clickContinue();
  }



  @AfterMethod
  public void close() {
    driver.close();
  }



}
