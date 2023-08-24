package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;

public class PomAmazonHeader extends BaseAmazonClass {

  WebDriver driver;

  @FindBy(id = "nav-logo-sprites")
  WebElement Logo;
  @FindBy(css = "#nav-global-location-popover-link")
  WebElement Location;
  @FindBy(id = "twotabsearchtextbox")
  WebElement Search;
  @FindBy(id = "nav-search-submit-button")
  WebElement Searchbutton;
  @FindBy(id = "nav_youraccount_btn")
  WebElement HelloYourName;
  @FindBy(id = "nav-orders")
  WebElement Orders;
  @FindBy(id = "nav-cart")
  WebElement Cart;

  public PomAmazonHeader() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);

  }

  public void clickLogo() {
    Logo.click();

  }

  public void clickLocation() {
    Location.click();
  }

  public void typeSearchKeyword(String keyword) {
    Search.sendKeys(keyword);
  }

  public void clickSearchbutton() {
    Searchbutton.click();
  }

  public void clickSigninMessage() {
    HelloYourName.click();
  }

  public void clickOrders() {
    Orders.click();
  }

  public void clickCart() {
    Cart.click();
  }



}
