package basePackage;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utility.DriverUtil;

public class BaseSignin extends BaseAmazonClass {

  @FindBy(id = "nav-link-accountList")
  public WebElement Hello;

  @FindBy(css = "#nav-flyout-ya-signin > a > span")
  public WebElement Signin;

  @FindBy(id = "ap_email")
  public WebElement SigninEmail;

  @FindBy(id = "continue")
  public WebElement Cont;

  @FindBy(id = "ap_password")
  public WebElement SigninPassword;

  @FindBy(id = "signInSubmit")
  public WebElement Signinbutton;

  @FindBy(id = "nav-link-accountList")
  public WebElement LoginMessage;

  WebDriver driver;
  Properties prop;

  public BaseSignin() {
    super();
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
  }


  @BeforeSuite(groups = {"signedIn"})
  public void signininitiate() throws InterruptedException {
    PageFactory.initElements(driver, this);
    mousehover();
    Signin.click();
    Thread.sleep(1000);
    SigninEmail.sendKeys(prop.getProperty("username"));
    Cont.click();
    SigninPassword.sendKeys(prop.getProperty("SigninPassword"));
    Signinbutton.click();
    Thread.sleep(1000);
    LoginMessage.click();
    Thread.sleep(500);

  }

  @BeforeMethod(groups = {"signedIn"})
  public void home() {
    PageFactory.initElements(driver, this);
    LoginMessage.click();
  }

  @AfterSuite(groups = {"signedIn"})
  public void destroy() {
    driver.close();
  }


}
