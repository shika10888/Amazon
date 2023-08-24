package testLayer;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import basePackage.BaseSignin;
import pom.PomYourAddress;
import utility.DriverUtil;
import utility.TimeUtils;

public class YourAddressTest extends BaseSignin {
  PomYourAddress address;

  WebDriver driver;

  Properties prop;

  public YourAddressTest() {
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    address = new PomYourAddress();
  }

  @Test(groups = {"signedIn"})
  public void User_Must_be_able_to_add_address() throws InterruptedException {
    PageFactory.initElements(driver, address);
    address.clickYourAddress();
    address.clickAddadress();
    TimeUtils.explicitWait(By.cssSelector("#address-ui-widgets-countryCode"));
    address.clickCountry();
    address.typeFullName(prop.getProperty("FullName"));
    TimeUtils.explicitWait(By.cssSelector("#address-ui-widgets-enterAddressFullName"));
    address.typePhonenumber(prop.getProperty("Phoneno"));
    TimeUtils.explicitWait(By.id("address-ui-widgets-enterAddressPhoneNumber"));
    address.typeAddress(prop.getProperty("home"));
    TimeUtils.explicitWait(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]"));
    address.typeCity("city");
    TimeUtils.explicitWait(By.xpath("//*[@id=\"address-ui-widgets-enterAddressCity\"]"));
    address.clickProvince();
    TimeUtils.explicitWait(
        By.xpath("//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span"));
    address.typePostalCode(prop.getProperty("postal"));
    TimeUtils.explicitWait(By.cssSelector("#address-ui-widgets-enterAddressPostalCode"));
    address.clickDefaultAddressCheckBox();
    TimeUtils.explicitWait(By.cssSelector("#address-ui-widgets-use-as-my-default  "));
    address.clickAddAddressButton();
  }
}
