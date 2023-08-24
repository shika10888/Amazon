package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;

public class PomYourAccount extends BaseAmazonClass {

  WebDriver driver;

  @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a")
  WebElement YourOrders;
  @FindBy(css = "#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a")
  WebElement Security;
  @FindBy(css = "#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div")
  WebElement YourAddress;
  @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a")
  WebElement YourPayment;

  public PomYourAccount() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void clickYourOrders() {
    YourOrders.click();
  }

  public void clickLoginSecurity() {
    Security.click();
  }

  public void clickYourAddress() {
    YourAddress.click();
  }

  public void YourPayments() {
    YourPayment.click();
  }



}
