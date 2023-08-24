package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;

public class PomYourPayments extends BaseAmazonClass {

  WebDriver driver;
  @FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a")
  WebElement YourPayments;
  @FindBy(linkText = "Add a payment method")
  WebElement AddPayment;
  @FindBy(css=".a-button-input")
  WebElement AddCard;
  @FindBy(name="addCreditCardNumber")
  WebElement Cardnumber;
  @FindBy(name="ppw-accountHolderName")
  WebElement NameonCard;
  @FindBy(name="ppw-expirationDate_month")
  WebElement Expmonth;
  @FindBy(className="a-dropdown-link")
  WebElement month;
  @FindBy(xpath="/html/body/div[5]/div/div/ul/li[2]/a")
  WebElement Expyear;
  @FindBy(className="a-dropdown-prompt")
  WebElement year;
  @FindBy(className = "a-button-text")
  WebElement Cancel;
  @FindBy(className = "a-button-input")
  WebElement AddNewCard;

  public PomYourPayments() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void clickYourPayments() {
    YourPayments.click();
  }

  public void clickAddPayment() {
    driver.navigate().refresh();
    AddPayment.click();
    
  }

  public void clickAddCard() {
    AddCard.click();
    
  }

  public void typeCardnumber(String cardno) throws InterruptedException {
    
    Thread.sleep(3000);
    driver.switchTo().frame(0);
    Cardnumber.click();
    Cardnumber.sendKeys(cardno);
  }

  public void typeNameonCard(String cardname) throws InterruptedException {
    Thread.sleep(500);
    NameonCard.click();
    NameonCard.sendKeys(cardname);
  }

  public void clickExpmonth() throws InterruptedException {
    Select expMonth = new Select(Expmonth);
    expMonth.selectByValue("5");
 
  }

  public void clickExpyear() throws InterruptedException {
    Thread.sleep(500);
    Expyear.click();
    Thread.sleep(500);
    year.click();
  }

  public void clickCancel() {
    Cancel.click();
  }

  public void clickAddNewCard() {
    AddNewCard.click();
  }

}
