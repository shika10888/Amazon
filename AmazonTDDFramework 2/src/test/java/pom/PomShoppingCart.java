package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;

public class PomShoppingCart extends BaseAmazonClass {

  WebDriver driver;
  @FindBy(linkText = "Medium Lingge Versatile Artificial Leather Handbag Women's Shoulder Bag Fashion Women's Bag")
  WebElement Handbag;
  @FindBy(linkText = "Brand: KKP")
  WebElement Bagdetails;
  @FindBy(id = "quantity")
  WebElement Quantity;
  @FindBy(className = "a-button-input")
  WebElement Delete;
  @FindBy(id = "add-to-cart-button")
  WebElement AddtoCart;
  @FindBy(id = "sw-atc-buy-box")
  WebElement CartSubtotal;


  public PomShoppingCart() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void clickHandbag() {
    Handbag.click();
  }

  public void displayBagdetails() {

    boolean a = Bagdetails.isDisplayed();
    System.out.println(a);
  }

  public void displayQuantity() {
    boolean c = Quantity.isDisplayed();
    System.out.println(c);
  }

  public void clickDelete() {
    Delete.click();
  }

  public void clickAddtoCart() {
    AddtoCart.click();
  }

  public void displayCartSubtotal() {
    boolean b = CartSubtotal.isDisplayed();
    System.out.println(b);
  }



}
