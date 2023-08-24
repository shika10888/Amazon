package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;

public class PomCreateAccountForm extends BaseAmazonClass {

  WebDriver driver;

  @FindBy(css = "#nav-flyout-ya-newCust > a")
  public WebElement Start;

  @FindBy(id = "ap_customer_name")
  WebElement Yourname;
  @FindBy(id = "ap_email")
  WebElement Email;
  @FindBy(id = "ap_password")
  WebElement Password;
  @FindBy(id = "ap_password_check")
  WebElement PasswordAgain;
  @FindBy(id = "continue")
  WebElement Continue;

  public void clickstarthere() {
    Start.click();
  }

  public PomCreateAccountForm() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void typeYourname(String name) {
    Yourname.sendKeys(name);
  }

  public void typeEmail(String mail) {
    Email.sendKeys(mail);
  }

  public void typePassword(String pass) {
    Password.sendKeys(pass);

  }

  public void typePasswordAgain(String passagain) {
    PasswordAgain.sendKeys(passagain);
  }

  public void clickContinue() {
    Continue.click();
  }
}
