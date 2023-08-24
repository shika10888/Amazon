package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;

public class PomYourAddress extends BaseAmazonClass {

  @FindBy(
      css = "#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")
  WebElement YourAddress;

  @FindBy(id = "ya-myab-address-add-link")
  WebElement AddAddress;

  @FindBy(css="#address-ui-widgets-countryCode")
  WebElement Country;
  @FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId_37")
  WebElement Canada;

  @FindBy(css = "#address-ui-widgets-enterAddressFullName")
  WebElement FullName;

  @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
  WebElement Phonenumber;

  @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressLine1\"]")
  WebElement Address;

  @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressCity\"]")
  WebElement City;

  @FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")
  WebElement Province;
  @FindBy(id ="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")
   WebElement Ontario;
  @FindBy(css = "#address-ui-widgets-enterAddressPostalCode")
  WebElement PostalCode;

  @FindBy(css = "#address-ui-widgets-use-as-my-default	")
  WebElement DefaultAddressCheckBox;

  @FindBy(css = "#address-ui-widgets-form-submit-button > span > input")
  WebElement AddAddressButton;

  WebDriver driver;

  public PomYourAddress() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void clickYourAddress() {
    YourAddress.click();
  }

  public void clickAddadress() {
    AddAddress.click();
  }

  public void clickCountry() throws InterruptedException {
    Country.click();
    Canada.click();
    
  }

  public void typeFullName(String fullname) {
    FullName.sendKeys(fullname);
  }

  public void typePhonenumber(String number) {
    Phonenumber.sendKeys(number);
  }

  public void typeAddress(String address) {
    Address.sendKeys(address);
  }

  public void typeCity(String city) {
    City.sendKeys(city);
  }

  public void clickProvince() {
    Province.click();
    Ontario.click();
    
  }

  public void typePostalCode(String postal) {
    PostalCode.sendKeys(postal);
  }

  public void clickDefaultAddressCheckBox() {
    DefaultAddressCheckBox.click();
  }

  public void clickAddAddressButton() {
    AddAddressButton.click();
  }



}
