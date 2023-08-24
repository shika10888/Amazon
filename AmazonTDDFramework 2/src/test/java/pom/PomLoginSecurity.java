package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;

public class PomLoginSecurity extends BaseAmazonClass {

  WebDriver driver;

  @FindBy(css = "#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a")
  WebElement LoginSecurity;
  @FindBy(css = "#auth-cnep-edit-name-button")
  WebElement Nameedit;
  @FindBy(id = "ap_customer_name")
  WebElement NewName;
  @FindBy(css = "#cnep_1C_submit_button")
  WebElement Save;
  @FindBy(css = "#auth-cnep-edit-email-button")
  WebElement Emailedit;
  @FindBy(css = "#auth-cnep-add-phone-button")
  WebElement Addphone;
  @FindBy(css = "#ap_phone_number")
  WebElement NewPhone;
  @FindBy(id = "auth-continue")
  WebElement Continueto;
  @FindBy(css = "#auth-change-phone-cancel")
  WebElement Cancelto;
  @FindBy(css = "#auth-cnep-edit-password-button")
  WebElement Passwordedit;
  @FindBy(css = "#auth-cnep-done-button")
  WebElement DoneButton;

  public PomLoginSecurity() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void clickLoginSecurity() {
    LoginSecurity.click();
  }

  public void clickNameedit() {
    Nameedit.click();
  }

  public void typeNewname(String newname) throws InterruptedException {
    NewName.clear();
    Thread.sleep(1000);
    NewName.sendKeys(newname);
  }

  public void clickSave() {
    Save.click();
  }

  public void clickEmailedit() {
    Emailedit.click();
  }

  public void clickAddphone() {
    Addphone.click();
  }

  public void typeNewPhone(String newno) {

    NewPhone.sendKeys(newno);
  }

  public void clickContinueto() {
    Continueto.click();
  }

  public void clickCancelto() {
    Cancelto.click();
  }

  public void clickPasswordedit() {
    Passwordedit.click();
  }

  public void clickDoneButton() {
    DoneButton.click();
  }



}
