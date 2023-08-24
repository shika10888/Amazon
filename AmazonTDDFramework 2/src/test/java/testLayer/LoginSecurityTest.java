package testLayer;

import static org.testng.Assert.assertTrue;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import basePackage.BaseSignin;
import pom.PomLoginSecurity;
import utility.DriverUtil;

public class LoginSecurityTest extends BaseSignin {


  PomLoginSecurity security;

  WebDriver driver;

  Properties prop;

  public LoginSecurityTest() {
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    security = new PomLoginSecurity();
  }

  @Test(groups = {"signedIn"})
  public void user_must_be_able_to_edit_securityDetails() throws InterruptedException {
    security.clickLoginSecurity();
    security.clickNameedit();

    security.typeNewname("Amy");
    security.clickSave();
    assertTrue(driver.findElement(By.tagName("body")).getText()
        .contains("You successfully changed your account!"));
  }

}
