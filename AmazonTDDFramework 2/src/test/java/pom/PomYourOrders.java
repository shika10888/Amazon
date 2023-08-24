package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;
import utility.TimeUtils;


public class PomYourOrders extends BaseAmazonClass {

  WebDriver driver;

  @FindBy(css = "#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a")
  WebElement YourOrders;
  @FindBy(css=".a-dropdown-prompt")
  WebElement Dropdown;
  @FindBy(id="time-filter_1")
  WebElement Past3months;
  @FindBy(linkText = "Buy Again")
  WebElement BuyAgain;
  @FindBy(linkText = "Not Yet Shipped")
  WebElement NotyetShipped;
  @FindBy(linkText = "Cancelled Orders")
  WebElement CancelledOrders;


  public PomYourOrders() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void clickYourOrders() {
    TimeUtils.explicitWait(By.cssSelector( "#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a"));
    YourOrders.click();
  }

  public void clickDropdown() {
    TimeUtils.explicitWait(By.cssSelector( ".a-dropdown-prompt"));
    Dropdown.click();
    Past3months.click();
  }

  public void BuyAgain() {
    BuyAgain.click();
  }

  public void NotyetShipped() {
    NotyetShipped.click();
  }

  public void CancelledOrders() {
    CancelledOrders.click();
  }



}
